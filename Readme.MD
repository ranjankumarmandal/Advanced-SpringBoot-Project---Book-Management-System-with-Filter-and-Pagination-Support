# SpringBoot Advanced Application Book Management System with Filter and Pagination Feature

# 📦 Spring Boot Book Management API

A simple Spring Boot REST API for managing books, demonstrating:

- CRUD operations
- Pagination & Sorting
- H2 in-memory database
- Profiles (`@Profile`)
- Bean qualification (`@Qualifier`)
- Transaction management (`@Transactional`)
- Scheduled tasks
- Custom configuration with `@Value`
- RESTful design with Spring Web

---

# Test Evidences:

- APIs on Swagger

 ![img.png](img.png)

- Postman Request

 ![img_1.png](img_1.png)

- Postman Request (for GET filter and pagination support: http://localhost:8080/books/page?page=0&size=5&sortBy=title)
 
 ![img_3.png](img_3.png)

- H2 DB console

 ![img_2.png](img_2.png)


## 🚀 Getting Started

### 🔧 Prerequisites

- Java 17+
- Spring Boot 3.x
- Spring Web
- Spring Data JPA
- H2 Database
- Spring Profiles
- Lombok (optional)
- Springdoc OpenAPI (Swagger UI)

### 📌 Special Features
- @Transactional for atomic DB updates
- @Profile for environment-specific beans (dev / prod)
- @Qualifier to resolve multiple implementations
- @Scheduled for periodic tasks
- @Value, @PostConstruct, @PreDestroy for lifecycle & config
- H2 console: http://localhost:8080/h2-console

### ▶️ Run the App

mvn spring-boot:run


## API Endpoints

**Method**	**Endpoint**	**Description**
- GET	    /books	    (Get all books)
- GET	    /books/{id}	(Get book by ID)
- POST	    /books	    (Add new book)
- PUT	    /books/{id}	(Update book by ID)
- DELETE	/books/{id}	(Delete book by ID)
- GET	    /books/page	(Paginated books)

## License
This project is licensed under the MIT License.

## You have some query?
If you have some query, feel free to connect with me here -- [Ranjan Kumar Mandal](https://www.linkedin.com/in/ranjan-kumar-m-818367158/)
