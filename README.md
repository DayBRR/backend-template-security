# backend-template-security

Plantilla base de backend en Spring Boot con seguridad ya integrada mediante el módulo reutilizable `security-core`.

## 🚀 Objetivo
Evitar configurar desde cero en cada proyecto: seguridad, configuración, usuarios, base de datos y Docker.

## 🧱 Stack
- Java 17
- Spring Boot 3.5.x
- Spring Security
- PostgreSQL / H2
- Flyway
- Docker

## 🔐 Seguridad
Incluye JWT, refresh tokens, sesiones, rate limiting y detección de reuse.

## ▶️ Ejecución
mvn clean install
mvn spring-boot:run

## 🐳 Docker
docker compose up --build

## 🛠️ Uso
Clona el proyecto, cambia el package base y empieza tu dominio.

## 📄 Licencia
MIT
