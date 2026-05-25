# Employee Management System (EMS)

A full-stack web-based Employee Management System developed using Spring Boot, HTML, CSS, JavaScript, and MySQL.  
This project allows administrators to manage employee records efficiently through a secure dashboard and REST APIs.

---

# Project Overview

The Employee Management System is designed to help organizations manage employee information digitally.

The system provides functionalities such as:

- Admin Login Authentication
- Add Employee
- Update Employee Details
- Delete Employee
- View All Employees
- REST API Testing using Postman
- Database Integration using MySQL
- Responsive Frontend Dashboard

This project follows a layered architecture used in real-world enterprise applications.

---

# Tech Stack

## Frontend Technologies
- HTML5
- CSS3
- JavaScript

## Backend Technologies
- Java
- Spring Boot
- Spring MVC
- Spring Data JPA
- Hibernate

## Database
- MySQL

## Tools & IDE
- Spring Tool Suite (STS)
- Eclipse IDE
- Postman
- MySQL Workbench

---

# Features

## Admin Features
- Secure Admin Login
- Dashboard Access
- Manage Employees

## Employee Management Features
- Add New Employee
- Update Existing Employee
- Delete Employee
- View Employee List

## API Features
- RESTful APIs
- JSON Data Exchange
- CRUD Operations

---

# Project Architecture

The project follows the MVC (Model View Controller) Architecture.

## Layers Used

### 1. Controller Layer
Handles HTTP requests and responses.

### 2. Service Layer
Contains business logic.

### 3. Repository Layer
Handles database operations using JPA.

### 4. Entity Layer
Represents database tables as Java classes.

### 5. Frontend Layer
Handles UI using HTML, CSS, and JavaScript.

---

# Project Folder Structure

```bash
EmployeeManagementSystem/
│
├── src/main/java/com/ems/
│   │
│   ├── controller/
│   │     ├── AdminController.java
│   │     ├── EmployeeController.java
│   │     └── EmployeeRestController.java
│   │
│   ├── service/
│   │     ├── EmployeeService.java
│   │     └── AdminService.java
│   │
│   ├── repository/
│   │     ├── EmployeeRepository.java
│   │     └── AdminRepository.java
│   │
│   ├── entity/
│   │     ├── Employee.java
│   │     └── Admin.java
│   │
│   └── EmployeeManagementSystemApplication.java
│
├── src/main/resources/
│   │
│   ├── templates/
│   │     ├── index.html
│   │     ├── dashboard.html
│   │     ├── addEmployee.html
│   │     ├── updateEmployee.html
│   │     └── login.html
│   │
│   ├── static/
│   │     ├── css/
│   │     ├── js/
│   │     └── images/
│   │
│   └── application.properties
│
└── pom.xml
```

---

# Database Configuration

## MySQL Database Name
```sql
ems
```

## application.properties

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/ems
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

---

# MySQL Table Structure

## Employee Table

| Column Name | Data Type |
|------------|-----------|
| id | int |
| name | varchar |
| email | varchar |
| department | varchar |
| salary | double |
| phone | varchar |

---

# Admin Table

| Column Name | Data Type |
|------------|-----------|
| id | int |
| username | varchar |
| password | varchar |

---

# Create Admin User SQL Query

```sql
INSERT INTO admin(username, password)
VALUES('admin', 'admin123');
```

---

# REST API Endpoints

## 1. Create Employee

### POST
```http
http://localhost:8080/api/employees
```

### Request Body

```json
{
    "name":"David",
    "email":"david@gmail.com",
    "department":"HR",
    "salary":45000,
    "phone":"9999999999"
}
```

---

## 2. Get All Employees

### GET
```http
http://localhost:8080/api/employees
```

---

## 3. Get Employee By ID

### GET
```http
http://localhost:8080/api/employees/1
```

---

## 4. Update Employee

### PUT
```http
http://localhost:8080/api/employees/1
```

### Request Body

```json
{
    "name":"David Updated",
    "email":"davidupdated@gmail.com",
    "department":"IT",
    "salary":65000,
    "phone":"8888888888"
}
```

---

## 5. Delete Employee

### DELETE
```http
http://localhost:8080/api/employees/1
```

---

# Screenshots to Add

You can add screenshots here after uploading images to GitHub.

## Login Page
```md
![Login Page](screenshots/login.png)
```

## Dashboard
```md
![Dashboard](screenshots/dashboard.png)
```

## Postman API Testing
```md
![Postman](screenshots/postman.png)
```

---

# How to Run the Project

## Step 1
Clone the repository.

```bash
git clone https://github.com/your-username/EmployeeManagementSystem.git
```

---

## Step 2
Open the project in:

- Spring Tool Suite (STS)
- Eclipse IDE

---

## Step 3
Create MySQL database.

```sql
CREATE DATABASE ems;
```

---

## Step 4
Update database credentials inside:

```properties
application.properties
```

---

## Step 5
Run the project.

```bash
Run As → Spring Boot App
```

---

# Output

After successful execution:

- Login page opens
- Admin can login
- Dashboard displays employee data
- CRUD operations work successfully
- APIs work in Postman

---

# Learning Outcomes

Through this project, the following concepts were learned:

- Spring Boot Project Structure
- MVC Architecture
- REST APIs
- CRUD Operations
- MySQL Database Connectivity
- JPA & Hibernate
- Frontend Integration
- Postman API Testing
- Error Handling & Debugging

---

# Future Enhancements

- Spring Security Authentication
- JWT Token Authentication
- Role-Based Access Control
- Pagination
- Search Functionality
- Export Reports (PDF/Excel)
- Responsive UI Improvements

---

# Conclusion

The Employee Management System is a complete full-stack CRUD application developed using modern Java backend technologies and frontend web technologies.

This project demonstrates practical implementation of:
- Spring Boot
- REST APIs
- MySQL Database Integration
- MVC Architecture
- Frontend & Backend Integration

The system successfully performs employee management operations efficiently and securely.

---

# Author

## Developed By
Your Name

## Technologies Used
Spring Boot | Java | HTML | CSS | JavaScript | MySQL

---
