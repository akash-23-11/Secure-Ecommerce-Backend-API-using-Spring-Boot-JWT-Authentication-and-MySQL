# Secure-Ecommerce-Backend-API-using-Spring-Boot-JWT-Authentication-and-MySQL
Secure Ecommerce REST API built with Spring Boot, JWT authentication, MySQL, and Swagger documentation.
# 🛒 Ecommerce Backend Advanced

A complete **Ecommerce Backend API** built with **Spring Boot**, featuring authentication, product management, order processing, and secure REST APIs using JWT.

This project demonstrates a **production-style backend architecture** with controllers, services, repositories, DTOs, security configuration, and global exception handling.

---

# 🚀 Features

✔ User Registration & Login
✔ JWT Authentication
✔ Product CRUD APIs
✔ Order Management
✔ Role-based access control
✔ Swagger API documentation
✔ Global exception handling
✔ Clean layered architecture

---

# 🏗 Project Architecture

```
com.ecommerce
│
├── config
│   └── SwaggerConfig
│
├── controller
│   ├── AuthController
│   ├── ProductController
│   ├── OrderController
│   └── UserController
│
├── dto
│   ├── LoginRequest
│   └── RegisterRequest
│
├── exception
│   ├── GlobalExceptionHandler
│   └── ResourceNotFoundException
│
├── model
│   ├── Product
│   ├── Order
│   └── User
│
├── repository
│   ├── ProductRepository
│   ├── OrderRepository
│   └── UserRepository
│
├── security
│   ├── JwtFilter
│   ├── JwtUtil
│   └── SecurityConfig
│
├── service
│   ├── ProductService
│   ├── OrderService
│   ├── AuthService
│   └── UserService
│
└── EcommerceApplication
```

---

# 🧰 Tech Stack

Backend:

* Java 19
* Spring Boot
* Spring Security
* Spring Data JPA
* Hibernate

Database:

* MySQL

Security:

* JWT Authentication

Documentation:

* Swagger / OpenAPI

Build Tool:

* Maven

Frontend (simple UI):

* HTML
* CSS
* JavaScript

---

# ⚙️ Setup Instructions

## 1️⃣ Clone the Repository

```
git clone https://github.com/yourusername/ecommerce-backend-advanced.git
```

```
cd ecommerce-backend-advanced
```

---

## 2️⃣ Configure Database

Create a MySQL database:

```
CREATE DATABASE ecommerce;
```

Update **application.properties**

```
spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce
spring.datasource.username=root
spring.datasource.password=yourpassword
```

---

## 3️⃣ Run the Application

Using Maven:

```
mvn spring-boot:run
```

Or run the main class:

```
EcommerceApplication.java
```

---

# 🌐 API Base URL

```
http://localhost:8080
```

---

# 📚 API Documentation

Swagger UI:

```
http://localhost:8080/swagger-ui.html
```

You can test all APIs directly from the Swagger interface.

---

# 🔑 Authentication

JWT authentication is used for securing endpoints.

Workflow:

1. Register a new user
2. Login to receive a JWT token
3. Use the token in Authorization header

Example:

```
Authorization: Bearer <token>
```

---

# 📦 API Endpoints

## Auth

```
POST /auth/register
POST /auth/login
```

---

## Products

```
GET /products
POST /products
PUT /products/{id}
DELETE /products/{id}
```

---

## Orders

```
POST /orders
GET /orders
GET /orders/{id}
```

---

## Users

```
GET /users
GET /users/{id}
```

---

# 🖥 Simple Frontend

A lightweight frontend is included in:

```
src/main/resources/static
```

Files:

```
index.html
style.css
script.js
```

Open in browser:

```
http://localhost:8080
```

---

# 📂 Database Initialization

The project includes:

```
data.sql
```

This file automatically inserts initial sample data when the application starts.

---

# 🛡 Security

Implemented using:

* Spring Security
* JWT Token authentication
* Request filtering
* Role-based access control

---

# 🎯 Learning Objectives

This project demonstrates:

* REST API development
* Authentication with JWT
* Secure backend architecture
* Spring Boot project structure
* Database integration with JPA
* API documentation

---

# 👨‍💻 Author

Your Name

GitHub:
https://github.com/akash-23-11

---


