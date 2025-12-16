# 🎓 Student Management System

A console-based **Student Management System** developed using **Core Java, JDBC, and MySQL**.  
This project performs complete **CRUD operations** and demonstrates real-world backend development concepts.

---

## 📌 Project Overview

The Student Management System allows users to manage student records through a menu-driven console application.  
It connects to a MySQL database using JDBC and follows the **DAO (Data Access Object) design pattern** for clean separation of concerns.

This project is ideal for understanding:
- Core Java fundamentals
- JDBC database connectivity
- SQL operations
- Backend application flow

---

## 🛠 Tech Stack

- **Language:** Java (Core Java)
- **Database:** MySQL
- **Connectivity:** JDBC
- **IDE:** Eclipse
- **Design Pattern:** DAO
- **Version Control:** Git & GitHub

---

## ✨ Features

- ➕ Add new student
- ✏️ Update student details  
  - Course  
  - Email  
  - Phone number
- ❌ Delete student by ID
- 👀 View all students in formatted table
- 🔐 Secure queries using `PreparedStatement`

---

## 🗄 Database Schema

```sql
CREATE TABLE students (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    phone VARCHAR(15),
    course VARCHAR(50),
    dob DATE,
    gender VARCHAR(10),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

▶️ How to Run the Project
1️⃣ Prerequisites

Java JDK installed

MySQL installed and running

Eclipse IDE

MySQL Connector/J (JDBC Driver)

2️⃣ Database Setup

Open MySQL Workbench or terminal

Create database and table using the SQL above

Update database credentials in DBUtil.java

jdbc:mysql://localhost:3306/student_db
username: root
password: your_password

3️⃣ Run Application

Import project into Eclipse

Add MySQL JDBC driver to Build Path

Run MainApp.java

Use the console menu to perform operations

🖥 Sample Console Output
1.Add  2.Update  3.Delete  4.View  5.Exit

+----+------------+----------------------+------------+---------------+------------+----------+
| ID | NAME       | EMAIL                | PHONE      | COURSE        | DOB        | GENDER   |
+----+------------+----------------------+------------+---------------+------------+----------+
| 1  | Karthik    | karthik@gmail.com    | 9876543210 | Java          | 2002-05-15 | Male     |
| 2  | Ravi       | ravi@gmail.com       | 9123456789 | Spring Boot   | 2001-03-20 | Male     |
+----+------------+----------------------+------------+---------------+------------+--
