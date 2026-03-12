# 🌟 Greeting App – Spring Boot REST API

A simple **Spring Boot REST API application** that demonstrates how to build a **Greeting Service** with full **CRUD operations** using:

- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database
- Maven

This project follows the **layered architecture** used in real-world Spring Boot applications.

```
Controller → Service → Repository → Database
```

---

# 📌 Features / Use Cases Implemented

| UC | Feature |
|----|--------|
| UC1 | Create Greeting Controller |
| UC2 | Return Greeting JSON using HTTP methods |
| UC3 | Implement Service Layer |
| UC4 | Greeting with First Name / Last Name |
| UC5 | Save Greeting Message in Repository |
| UC6 | Find Greeting by ID |
| UC7 | List All Greetings |
| UC8 | Update Greeting Message |
| UC9 | Delete Greeting Message |

---

# 🏗 Project Architecture

```
GreetingApp
│
├── controller
│     GreetingController.java
│
├── service
│     GreetingService.java
│
├── repository
│     GreetingRepository.java
│
├── model
│     Greeting.java
│
└── GreetingAppApplication.java
```

---

# ⚙️ Technologies Used

| Technology | Purpose |
|------------|--------|
| Spring Boot | Application Framework |
| Spring Web | REST API |
| Spring Data JPA | Database interaction |
| H2 Database | In-memory database |
| Maven | Build tool |
| Java 21+ | Programming language |

---

# 🚀 Running the Application

### 1️⃣ Clone the Repository

```bash
git clone https://github.com/your-username/greeting-app.git
```

### 2️⃣ Navigate to Project

```bash
cd greeting-app
```

### 3️⃣ Run the Application

```bash
mvn spring-boot:run
```

Application will start on:

```
http://localhost:8080
```

---

# 🗄 H2 Database Console

Open in browser:

```
http://localhost:8080/h2-console
```

Connection settings:

```
JDBC URL: jdbc:h2:mem:testdb
User: sa
Password:
```

---

# 📡 REST API Endpoints

## 1️⃣ Create Greeting

```
POST /greeting
```

Example:

```bash
curl -X POST "http://localhost:8080/greeting?firstName=Akhil&lastName=Puri"
```

Response

```json
{
  "id": 1,
  "message": "Hello Akhil Puri"
}
```

---

## 2️⃣ Get Greeting by ID

```
GET /greeting/{id}
```

Example

```bash
curl http://localhost:8080/greeting/1
```

Response

```json
{
  "id": 1,
  "message": "Hello Akhil Puri"
}
```

---

## 3️⃣ Get All Greetings

```
GET /greeting/all
```

Example

```bash
curl http://localhost:8080/greeting/all
```

Response

```json
[
  {
    "id": 1,
    "message": "Hello World"
  },
  {
    "id": 2,
    "message": "Hello Akhil"
  }
]
```

---

## 4️⃣ Update Greeting

```
PUT /greeting/{id}
```

Example

```bash
curl -X PUT "http://localhost:8080/greeting/1?message=Hello%20Spring%20Boot"
```

Response

```json
{
  "id": 1,
  "message": "Hello Spring Boot"
}
```

---

## 5️⃣ Delete Greeting

```
DELETE /greeting/{id}
```

Example

```bash
curl -X DELETE http://localhost:8080/greeting/1
```

Response

```
Greeting deleted successfully
```

---

# 🧠 Greeting Logic

The application generates greeting messages based on user input.

| Input | Output |
|------|-------|
| No name | Hello World |
| First Name | Hello FirstName |
| Last Name | Hello LastName |
| First + Last | Hello FirstName LastName |

---

# 🔄 Application Flow

```
Client Request
      │
      ▼
GreetingController
      │
      ▼
GreetingService
      │
      ▼
GreetingRepository
      │
      ▼
H2 Database
```

---

# 📚 Learning Objectives

This project demonstrates:

- REST API development using **Spring Boot**
- Layered architecture
- CRUD operations
- JPA & Repository pattern
- Dependency Injection
- H2 in-memory database
- Testing APIs using **curl**

---

# 👨‍💻 Author

**Akhil**
