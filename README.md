# 🧾 Journal Application

A full-stack **Spring Boot–based journal management system** that allows users to securely create, edit, and manage their journal entries.  
The application includes **MongoDB** for persistence, **Redis** for caching, **Spring Security** for authentication and authorization, and **structured logging** for monitoring.  
Additionally, a **Cron Scheduler** automates background maintenance tasks.

---

## 🚀 Features
- ✏️ Create, read, update, and delete journal entries (CRUD)
- 🔐 Secure authentication and authorization with **Spring Security**
- ⚡ Fast data retrieval with **Redis caching**
- 🗃️ Persistent data storage in **MongoDB**
- ⏰ Automated cleanup and background tasks with **Spring Scheduler**
- 🧾 **Structured logging** for application monitoring and debugging

---

## 🛠️ Technologies Used
- **Spring Boot** – Core application framework  
- **MongoDB** – NoSQL database for storing journal entries  
- **Redis** – In-memory cache for performance optimization  
- **Spring Security** – Authentication and access control  
- **Spring Scheduler** – For cron-based task automation  
- **SLF4J / Logback** – For structured logging  
- **Maven** – Build and dependency management  

---

## ⚙️ Getting Started

### Prerequisites
Make sure you have the following installed:
- Java JDK 17+  
- Maven 3.8+  
- MongoDB  
- Redis  

### Installation

```bash
# Clone the repository
git clone https://github.com/owl-screen/journal.git

# Navigate into the project
cd journal

# Build the application
mvn clean install

# Run the application
mvn spring-boot:run
