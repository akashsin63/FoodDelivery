# FoodDelivery

## Overview

FoodDelivery is a Java-based backend system designed to handle food delivery services. It is built using Spring Boot, leveraging features like Spring Data JPA, MySQL, and JWT for authentication and authorization. The system is designed to manage users, restaurants, food items, and orders with seamless CRUD operations.

## Features

- **User Management**: Register, login, and manage user profiles (both customers and restaurant owners).
- **Restaurant Management**: Add, update, and manage restaurant information and menus.
- **Order Management**: Place orders, view order history, and manage the order lifecycle.
- **Authentication**: JWT-based authentication for securing endpoints.
- **MySQL**: Used as the relational database for persisting data.
- **Layered Architecture**: Follows a layered architecture with distinct layers for controllers, services, repositories, and DTOs.
- **Global Exception Handling**: Centralized exception handling using `@ControllerAdvice`.

## Technologies Used

- **Java 8+**
- **Spring Boot**
- **Spring Data JPA**
- **MySQL**
- **JWT (JSON Web Token)**
- **Hibernate**
- **Maven**

## Prerequisites

- Java 8 or higher
- Maven
- MySQL

## Getting Started

### Clone the Repository

```bash
git clone https://github.com/akashsin63/FoodDelivery.git
cd FoodDelivery


