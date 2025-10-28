//go:build mage
// +build mage

package main

import (
	"bytes"
	"fmt"
	"os"
	"os/exec"
	"path/filepath"
	"strings"

	"github.com/magefile/mage/mg"
)

// helper: get environment variable or default
func getEnv(key, def string) string {
	if v := os.Getenv(key); v != "" {
		return v
	}
	return def
}

// runCmd runs a command in optional dir and streams output
func runCmd(dir string, name string, args ...string) error {
	fmt.Printf("Running: %s %s (in %s)\n", name, strings.Join(args, " "), dir)
	cmd := exec.Command(name, args...)
	if dir != "" {
		cmd.Dir = dir
	}
	cmd.Stdout = os.Stdout
	cmd.Stderr = os.Stderr
	return cmd.Run()
}

// runShell runs a shell command string via bash -lc
func runShell(dir string, cmdstr string) error {
	return runCmd(dir, "bash", "-lc", cmdstr)
}

// compute current git tag (latest) or v0.0.0
func currentVersion(dir string) (string, error) {
	cmd := exec.Command("bash", "-lc", `git tag -l --sort -version:refname | head -n 1 || echo "v0.0.0"`)
	if dir != "" {
		cmd.Dir = dir
	}
	var out bytes.Buffer
	cmd.Stdout = &out
	cmd.Stderr = os.Stderr
	if err := cmd.Run(); err != nil {
		return "", err
	}
	v := strings.TrimSpace(out.String())
	if v == "" {
		v = "v0.0.0"
	}
	return v, nil
}

// nextVersion bumps patch part
func nextVersion(dir string) (string, error) {
	cur, err := currentVersion(dir)
	if err != nil {
		return "", err
	}
	// expecting vMAJOR.MINOR.PATCH
	cur = strings.TrimPrefix(cur, "v")
	parts := strings.Split(cur, ".")
	if len(parts) < 3 {
		return "v0.0.1", nil
	}
	patch := parts[2]
	pnum := 0
	fmt.Sscanf(patch, "%d", &pnum)
	pnum++
	return fmt.Sprintf("v%s.%s.%d", parts[0], parts[1], pnum), nil
}

// Protoc helpers
func protoc(args ...string) error {
	return runCmd("", "protoc", args...)
}

// Targets below mirror Taskfile.yml tasks

// GoAuth generates Go gRPC code for auth
func GoAuth() error {
	protoDir := getEnv("PROTO_DIR", "proto")
	goOut := getEnv("GO_OUT_DIR", ".")
	// protoc --proto_path={{.PROTO_DIR}} --proto_path=third_party --go_out={{.GO_OUT_DIR}} --go-grpc_out={{.GO_OUT_DIR}} {{.PROTO_DIR}}/auth/auth.proto
	args := []string{"--proto_path=" + protoDir, "--proto_path=third_party", "--go_out=" + goOut, "--go-grpc_out=" + goOut, filepath.Join(protoDir, "auth/auth.proto")}
	return protoc(args...)
}

// GoObject generates Go gRPC code for object
func GoObject() error {
	protoDir := getEnv("PROTO_DIR", "proto")
	goOut := getEnv("GO_OUT_DIR", ".")
	args := []string{"--go_out=" + goOut, "--go-grpc_out=" + goOut, filepath.Join(protoDir, "object/object.proto")}
	return protoc(args...)
}

// GoCmd generates Go gRPC code for cmd
func GoCmd() error {
	protoDir := getEnv("PROTO_DIR", "proto")
	goOut := getEnv("GO_OUT_DIR", ".")
	args := []string{"--go_out=" + goOut, "--go-grpc_out=" + goOut, filepath.Join(protoDir, "cmd/cmd.proto")}
	return protoc(args...)
}

// GoAll runs go:auth, go:object, go:cmd
func GoAll() {
	mg.Deps(GoAuth, GoObject, GoCmd)
}

// JavaAuth generates Java gRPC code for auth
func JavaAuth() error {
	protoDir := getEnv("PROTO_DIR", "proto")
	// protoc --proto_path={{.PROTO_DIR}} --proto_path=third_party --proto_path=./proto/auth/ --java_out=java --grpc-java_out=java {{.PROTO_DIR}}/auth/auth.proto
	args := []string{"--proto_path=" + protoDir, "--proto_path=third_party", "--proto_path=./proto/auth/", "--java_out=java", "--grpc-java_out=java", "--plugin=protoc-gen-grpc-java=/home/madi/.local/bin/protoc-gen-grpc-java", filepath.Join(protoDir, "auth/auth.proto")}
	return protoc(args...)
}

// JavaObject generates Java gRPC code for object
func JavaObject() error {
	protoDir := getEnv("PROTO_DIR", "proto")
	args := []string{"--proto_path=./proto/object/", "--java_out=java", "--grpc-java_out=java", "--plugin=protoc-gen-grpc-java=/home/madi/.local/bin/protoc-gen-grpc-java", filepath.Join(protoDir, "object/object.proto")}
	return protoc(args...)
}

// JavaCmd generates Java gRPC code for cmd
func JavaCmd() error {
	protoDir := getEnv("PROTO_DIR", "proto")
	args := []string{"--proto_path=./proto/cmd/", "--java_out=java", "--grpc-java_out=java", "--plugin=protoc-gen-grpc-java=/home/madi/.local/bin/protoc-gen-grpc-java", filepath.Join(protoDir, "cmd/cmd.proto")}
	return protoc(args...)
}

// JavaAll runs java:auth, java:object, java:cmd
func JavaAll() {
	mg.Deps(JavaAuth, JavaObject, JavaCmd)
}

// JSAuth generates JS gRPC code for auth
func JSAuth() error {
	protoDir := getEnv("PROTO_DIR", "proto")
	// Prefer using grpc_tools_node_protoc (wrapper that provides JS generators)
	tool, err := exec.LookPath("grpc_tools_node_protoc")
	if err != nil {
		return fmt.Errorf("grpc_tools_node_protoc not found in PATH; install grpc-tools npm package: npm i -g grpc-tools grpc_tools_node_protoc_plugin\noriginal error: %w", err)
	}
	args := []string{"--proto_path=" + protoDir, "--proto_path=third_party", "--js_out=import_style=commonjs:js", "--grpc_out=grpc_js:js", filepath.Join(protoDir, "auth/auth.proto")}
	return runCmd("", tool, args...)
}

// JSObject generates JS gRPC code for object
func JSObject() error {
	protoDir := getEnv("PROTO_DIR", "proto")
	tool, err := exec.LookPath("grpc_tools_node_protoc")
	if err != nil {
		return fmt.Errorf("grpc_tools_node_protoc not found in PATH; install grpc-tools npm package: npm i -g grpc-tools grpc_tools_node_protoc_plugin\noriginal error: %w", err)
	}
	args := []string{"--proto_path=" + protoDir, "--proto_path=third_party", "--js_out=import_style=commonjs:js", "--grpc_out=grpc_js:js", filepath.Join(protoDir, "object/object.proto")}
	return runCmd("", tool, args...)
}

// JSCmd generates JS gRPC code for cmd
func JSCmd() error {
	protoDir := getEnv("PROTO_DIR", "proto")
	tool, err := exec.LookPath("grpc_tools_node_protoc")
	if err != nil {
		return fmt.Errorf("grpc_tools_node_protoc not found in PATH; install grpc-tools npm package: npm i -g grpc-tools grpc_tools_node_protoc_plugin\noriginal error: %w", err)
	}
	args := []string{"--proto_path=" + protoDir, "--proto_path=third_party", "--js_out=import_style=commonjs:js", "--grpc_out=grpc_js:js", filepath.Join(protoDir, "cmd/cmd.proto")}
	return runCmd("", tool, args...)
}

// JSAll runs js:auth, js:object, js:cmd
func JSAll() {
	mg.Deps(JSAuth, JSObject, JSCmd)
}

// All runs go:all, java:all, js:all
func All() {
	mg.Deps(GoAll, JavaAll, JSAll)
}

// Patch mirrors the patch task: remove generated dirs, create java, run All, git add/commit/push/tag
func Patch() error {
	// remove auth cmd object java and mkdir java
	toRemove := []string{"auth", "cmd", "object", "java"}
	for _, p := range toRemove {
		if err := os.RemoveAll(p); err != nil {
			return fmt.Errorf("removing %s: %w", p, err)
		}
	}
	if err := os.MkdirAll("java", 0755); err != nil {
		return fmt.Errorf("mkdir java: %w", err)
	}

	// run All
	All()

	// git add .
	if err := runCmd("", "git", "add", "."); err != nil {
		return fmt.Errorf("git add: %w", err)
	}
	// git commit -m "Update generated code"
	// allow commit to fail if nothing to commit
	if err := runCmd("", "git", "commit", "-m", "Update generated code"); err != nil {
		fmt.Println("git commit failed (maybe nothing to commit):", err)
	}

	// echo current/next version and push + tag
	cur, err := currentVersion("")
	if err != nil {
		return err
	}
	nxt, err := nextVersion("")
	if err != nil {
		return err
	}
	fmt.Println("Current version:", cur)
	fmt.Println("Next version:", nxt)

	if err := runCmd("", "git", "push", "origin", "main"); err != nil {
		return fmt.Errorf("git push: %w", err)
	}
	// git tag {{.NEXT_VERSION}}
	if err := runCmd("", "git", "tag", nxt); err != nil {
		return fmt.Errorf("git tag: %w", err)
	}
	if err := runCmd("", "git", "push", "origin", nxt); err != nil {
		return fmt.Errorf("git push tag: %w", err)
	}

	return nil
}
