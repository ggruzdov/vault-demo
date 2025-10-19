# Spring Cloud Vault Demo

This is a simple Spring Boot application that demonstrates how to use Spring Cloud Vault to store and retrieve secrets from HashiCorp Vault.

## Prerequisites
- Java 21
- Docker
- Docker Compose
- Maven
- Git

## Getting Started
1. Clone the repository:
    ```bash
    git clone https://github.com/ggruzdov/vault-demo.git
    cd vault-demo
    ```
2. Start the Vault server:
    ```bash
    docker-compose up -d
    ```
3. Build the application:
    ```bash
    mvn clean package
    ```
4. Run the application:
    ```bash
    mvn spring-boot:run
    ```
5. You should see the service information retrieved from Vault in the console output.
