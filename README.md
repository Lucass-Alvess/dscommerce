# 📦 DSCommerce

API REST de um sistema de e-commerce, desenvolvido para estudo e prática de Java com Spring Boot, no curso **Java Spring** da DevSuperior.

---

## 📘 Sobre o projeto

O **DSCommerce** é um sistema backend completo utilizado como base de aprendizado, projetado para explorar:

- Relacionamentos JPA (muitos-para-um, muitos-para-muitos, etc.)
- Boas práticas de API REST
- Autenticação e autorização com OAuth2, JWT e Spring Security
- CRUDs completos e fluxo real de aplicação
- Validações com Bean Validation

O sistema permite gerenciar produtos, categorias, usuários e pedidos, com autenticação baseada em tokens JWT e permissões por perfil.

---

## 🧩 Modelo Conceitual

![Modelo de domínio DSCommerce](https://github.com/Lucass-Alvess/dscommerce/blob/main/assets/dscommerce.png)

---

## 📑 Tabela de Conteúdo

- [Sobre o projeto](#sobre-o-projeto)  
- [Modelo Conceitual](#modelo-conceitual)  
- [Requisitos](#requisitos)  
- [Funcionalidades](#funcionalidades)  
- [Ações da API](#ações-da-api)  
- [Tecnologias Utilizadas](#tecnologias-utilizadas)  
- [Aprendizados](#aprendizados)  
- [Rodando localmente](#rodando-localmente)  
- [Rodando os testes](#rodando-os-testes)

---

## 📋 Requisitos

- Java **17+**
- Spring Boot  
- Git  
- Postman ou Insomnia  
- PostgreSQL (opcional)  

---

## ⚙️ Funcionalidades

- Cadastro e login de usuários  
- Autenticação com OAuth2 + JWT  
- Gerenciamento de produtos  
- Gerenciamento de categorias  
- Gerenciamento de pedidos  
- Controle de acesso por roles (USER / ADMIN)

---

## 🚀 Ações da API

### 🔐 Autenticação
- **POST** `/oauth2/token` – Gera token de acesso

### 🛒 Produtos
- **GET** `/products/{id}`  
- **GET** `/products`  
- **GET** `/products/search`  
- **POST** `/products` *(ADMIN)*  
- **PUT** `/products/{id}` *(ADMIN)*  
- **DELETE** `/products/{id}` *(ADMIN)*  

### 👤 Usuário
- **GET** `/users/me`

### 🏷 Categorias
- **GET** `/categories`

---

## 🛠 Tecnologias Utilizadas

- Java  
- Spring Boot  
- Spring Security  
- Spring Data JPA  
- Hibernate  
- OAuth2  
- JWT  
- Bcrypt  
- PostgreSQL  
- H2  

---

## 🎓 Aprendizados

Durante o desenvolvimento deste projeto foi possível aprofundar conhecimentos em:

- Bean Validation  
- Exceções customizadas  
- Relações JPA (N:N, 1:N, N:1)  
- Autenticação e autorização com Spring Security  
- Estruturação de serviços, DTOs e repositórios  
- Boas práticas de arquitetura limpa em aplicações Spring  

---

## ▶️ Rodando localmente

Clone o repositório:

```bash
git clone https://github.com/Lucass-Alvess/dscommerce.git
```

Entre no diretório:

```bash
cd java-spring-boot-dscommerce
```

Execute o projeto:

```bash
./mvnw spring-boot:run
```

