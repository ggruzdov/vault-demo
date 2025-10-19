#!/usr/bin/env sh
set -e

echo "==> Enabling KV secrets engine at path 'apps'..."
vault secrets enable -path=kv kv-v2 || echo "KV already enabled"

echo "==> Writing sample secrets..."
vault kv put kv/apps/application service.project="Vault-Demo"
vault kv put kv/apps/vault-demo service.description="Spring Boot application with Vault integration" service.url="http://localhost:8080"

echo "==> Listing all secrets under 'apps/'..."
vault kv list kv/apps/ || true

echo "==> Done!"
