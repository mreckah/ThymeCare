# ThymeCare - Patient Management System

<h1 align="center">
  <a href="https://github.com/mreckah">
    <img height="180" width="836" src="images/img_16.png" alt="ThymeCare App" style="max-width: 300px ; border-radius: 10px;">
  </a>
</h1>
<p align="center">
  &nbsp;    
  <a target="_blank" href="https://www.linkedin.com/in/nabbar-oussama/">
    <img height="20" src="https://img.shields.io/badge/LinkedIn-0077B5?style=flat&logo=linkedin&logoColor=white" alt="LinkedIn Badge" />
  </a>
  <a href="mailto:m.reckahwalt@gmail.com" target="_blank" onclick="window.open(this.href,'_blank'); return false;">
    <img height="20" src="https://img.shields.io/badge/Gmail-D14836?style=flat&logo=gmail&logoColor=white" alt="Gmail Badge" />
  </a>
  <a target="_blank" href="https://github.com/mreckah">
    <img height="20" src="https://img.shields.io/badge/GitHub-181717?style=flat&logo=github&logoColor=white" alt="GitHub Badge" />
  </a>
</p>

## 📌 Project Overview

ThymeCare is a web-based Java application for managing patient records. Built using **Spring MVC, Thymeleaf, and Spring Data JPA**, it provides functionalities for storing and retrieving patient data efficiently.

## 📌 Features

- **List Patients** (with pagination)
- **Search Patients** by name
- **Delete Patients**
- **Add New Patients**
- **Filter & Sort** patients
- **Improved UI using Thymeleaf**

## 🛠️ Technologies Used

- **Spring Boot** - Backend Framework
- **Spring MVC** - Web layer
- **Spring Data JPA** - Database integration
- **H2 Database** - In-memory database
- **Spring Security** - Authentication & Authorization
- **Bootstrap** - Frontend Styling

## 📌 Security Documentation

### Authentication & Authorization

- **Spring Security** is used for authentication and authorization.
- The application uses a custom login page (`/login`) instead of the default Spring Security login page.
- User roles (`ADMIN` and `USER`) are managed via JDBC authentication, with roles stored in the database.
- The `SecurityConfig` class configures security settings, including custom login page, role-based access control, and error handling.

### Login Page

- The login page is served by the `SecurityController` at the `/login` endpoint.
- The login form is styled using Bootstrap and Bootstrap Icons for a modern look.
- Error handling for login failures is managed by Spring Security.

### Role-Based Access Control

- **Admin** users have full access to all functionalities.
- **User** users have limited access, as defined in the `SecurityConfig`.

### Security Best Practices

- Passwords are encoded using a `PasswordEncoder` bean.
- CSRF protection is enabled by default.
- Access denied errors are handled via a custom `/denied` page.
  ![img_20.png](images%2Fimg_20.png)

---

### **1 Get All Patients (Fetch Data)- Connection with databsase**

![img_10.png](images%2Fimg_10.png)
![img_5.png](images%2Fimg_5.png)
![img_17.png](images%2Fimg_17.png)

### **2 Post A Patients (Store Data)**

![img_7.png](images%2Fimg_7.png)
![img_12.png](images%2Fimg_12.png)
![img_13.png](images%2Fimg_13.png)

### **3 DELETE a Patient (Delete)**!

![img_9.png](images%2Fimg_9.png)

### **4 Edit a Patient (Edit)**!

![img_11.png](images%2Fimg_11.png)

### **5 Roles (ADMIN/USER)**!

## Admin Interface With All Access

![img_14.png](images%2Fimg_14.png)

## User Interface With Limited Access

![img_15.png](images%2Fimg_15.png)

### **6 JDBC Authentification (Roles Added To Db)**!

![img_19.png](images%2Fimg_19.png)
