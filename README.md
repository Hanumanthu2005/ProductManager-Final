# 🛠️ Product Manager - Final Version

This is a full-stack **Spring Boot** application for managing products at home or office. You can add, view, update, delete, and search products using a simple web interface built with **Thymeleaf**. The product data is stored in a **MySQL** database using **Spring Data JPA**.

---

## 🚀 Features

- 🔍 View all products
- ➕ Add new products
- 📝 Update product details
- ❌ Delete products
- 🔎 Filter/search products by type, name, or location
- 📄 Styled UI using **Thymeleaf** and custom **CSS**

---

## 🧰 Tech Stack

| Layer         | Technology           |
|---------------|----------------------|
| Backend       | Spring Boot, Spring Web, Spring Data JPA |
| Frontend      | Thymeleaf, HTML, CSS |
| Database      | MySQL                |
| Build Tool    | Maven                |
| IDE           | IntelliJ / Eclipse   |

---

## 🗃️ Database Configuration

Make sure you have a MySQL server running. Create a database:

```sql
CREATE DATABASE product_manager;

```
## application properties

```java
spring.datasource.url=jdbc:mysql://localhost:3306/product_manager
spring.datasource.username=your_username
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```
## 🧪 How to Run the Project

Follow these steps to run the application locally:

### 1. Clone the Repository

```bash
git clone https://github.com/Hanumanthu2005/ProductManager-Final.git
cd ProductManager-Final
```

2. Set Up MySQL
a.Start your MySQL server
b.Create the database:
```sql
CREATE DATABASE product_manager;
```
3. Update application.properties
   Open src/main/resources/application.properties and set your MySQL username and password.

4. Build and Run
   Using an IDE (IntelliJ or Eclipse)

Open the project
   Wait for Maven dependencies to load
   Run the ProductManagerApplication.java class (which contains the main method)
   
5. Open in Browser
Once the app starts, visit:
```link
http://localhost:8080/products
```
