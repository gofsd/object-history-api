#!/usr/bin/env bash
set -euo pipefail

# Fedora-friendly installer for protoc and language plugins
# Suitable for Fedora / Sway environments. Script will use dnf and
# install language plugins for Go, Node.js, and Java.

echo ">>> Detecting distro..."
if [ -f /etc/fedora-release ]; then
  DISTRO=fedora
else
  DISTRO=unknown
fi

if [ "$DISTRO" != "fedora" ]; then
  echo "Warning: this script is tailored for Fedora. Detected: $DISTRO"
fi


# Development tools (gcc, make, etc.)
sudo dnf groupinstall -y "Development Tools" || sudo dnf install -y @development-tools || true

# ===================================================
# Install protoc compiler (v33.0) — download official release
# ===================================================
PROTOC_VERSION=33.0
PROTOC_ZIP=protoc-${PROTOC_VERSION}-linux-x86_64.zip

echo ">>> Installing protoc v${PROTOC_VERSION}..."
curl -SL --output ${PROTOC_ZIP} https://github.com/protocolbuffers/protobuf/releases/download/v${PROTOC_VERSION}/${PROTOC_ZIP}
sudo unzip -o ${PROTOC_ZIP} -d /usr/local bin/protoc
sudo unzip -o ${PROTOC_ZIP} -d /usr/local 'include/*'
rm -f ${PROTOC_ZIP}

echo "$(protoc --version) installed"

# ===================================================
# Install Go plugins (protoc-gen-go, protoc-gen-go-grpc)
# ===================================================
echo ">>> Installing Go protobuf and gRPC plugins..."
GOPATH=$(go env GOPATH 2>/dev/null || echo "$HOME/go")
export PATH="$PATH:$GOPATH/bin:$HOME/.local/bin"

# Pin versions known to work
go install google.golang.org/protobuf/cmd/protoc-gen-go@v1.36.5
go install google.golang.org/grpc/cmd/protoc-gen-go-grpc@v1.3.0

# ===================================================
# Install Node.js protoc plugin and helpers
# ===================================================
echo ">>> Installing Node.js gRPC/protobuf tools (npm)..."
# Use npm global install; ensure npm prefix is in PATH
NPM_PREFIX=$(npm config get prefix 2>/dev/null || echo "/usr/local")
export PATH="$PATH:$NPM_PREFIX/bin"
sudo npm install -g grpc-tools grpc_tools_node_protoc_plugin @grpc/grpc-js @grpc/proto-loader || true

# ===================================================
# Install Java protoc-gen-grpc-java binary
# ===================================================
echo ">>> Installing Java gRPC protoc plugin..."
GRPC_JAVA_VERSION=1.71.0
mkdir -p "$HOME/.local/bin"
curl -L -o "$HOME/.local/bin/protoc-gen-grpc-java" \
  "https://repo1.maven.org/maven2/io/grpc/protoc-gen-grpc-java/${GRPC_JAVA_VERSION}/protoc-gen-grpc-java-${GRPC_JAVA_VERSION}-linux-x86_64.exe"
chmod +x "$HOME/.local/bin/protoc-gen-grpc-java"

echo
echo ">>> Verification"
echo "protoc: $(command -v protoc || echo 'not found') $(protoc --version 2>/dev/null || true)"
echo "protoc-gen-go: $(command -v protoc-gen-go || echo 'not found')"
echo "protoc-gen-go-grpc: $(command -v protoc-gen-go-grpc || echo 'not found')"
echo "protoc-gen-grpc-java: $(command -v protoc-gen-grpc-java || echo 'not found')"
echo "grpc_tools_node_protoc: $(command -v grpc_tools_node_protoc || echo 'not found')"

echo
echo "✅ Setup complete for Fedora."
echo
echo "Example usage:" 
echo "  # Go:"
echo "  protoc --proto_path=proto --go_out=. --go-grpc_out=. proto/auth/auth.proto"
echo
echo "  # Java:"
echo "  protoc --proto_path=proto --java_out=src/main/java --grpc-java_out=src/main/java proto/auth/auth.proto"
echo
echo "  # Node.js:"
echo "  grpc_tools_node_protoc --js_out=import_style=commonjs:js --grpc_out=grpc_js:js proto/auth/auth.proto"
