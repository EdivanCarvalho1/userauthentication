# API de Autenticação de Usuários

Esta é uma **API de Autenticação de Usuários** desenvolvida utilizando Spring Boot e Java. A API fornece serviços de autenticação, incluindo login de usuários, registro e autorização baseada em JWT.

## Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3.3.2**
    - Spring Security
    - Spring Data JPA
    - Spring Web
- **JWT (Java JWT 4.4.0)** para autenticação baseada em tokens
- **MySQL** para gerenciamento de banco de dados
- **Lombok** para reduzir o código boilerplate
- **Spring Boot DevTools** para suporte no desenvolvimento
- **Maven** para gerenciamento do projeto e dependências

## Funcionalidades

- Registro e login de usuários
- Geração e validação segura de tokens JWT
- Controle de acesso baseado em papéis usando Spring Security
- Gerenciamento de banco de dados com MySQL e JPA
- Testes de integração usando Spring Boot Test e Spring Security Test

## Como começar

### Pré-requisitos

- Java 17 ou superior
- Maven
- MySQL

### Configuração

1. Clone o repositório:
   ```bash
   git clone https://github.com/EdivanCarvalho1/userauthentication.git
   cd userauthentication

### Rotas

```bash
POST /auth/register: Registra um novo usuário.
POST /auth/login: Autentica um usuário e retorna um token JWT.
GET /user: Verifica se o user está autenticado.