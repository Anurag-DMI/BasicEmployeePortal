# Employee Management REST API (Spring Boot)

This is a Spring Boot project designed to perform CRUD (Create, Read, Update, Delete) operations on an `employee` table using a REST API. The project connects to a MySQL database using both JPA and JDBC for data persistence.

## Features

The API allows you to perform the following operations on the `employee` table:

1. **Get all employees**:  
   **Method**: `GET`  
   **Endpoint**: `/allemp`  
   Fetches the list of all employees.

2. **Get employee by ID**:  
   **Method**: `GET`  
   **Endpoint**: `/emp/{empId}`  
   Fetches the details of a specific employee by their `empId`.

3. **Add a new employee**:  
   **Method**: `POST`  
   **Endpoint**: `/emp`  
   **Request Body Example**:
   ```json
   {
     "empId": 5,
     "name": "E",
     "department": "HR",
     "salary": 60000
   }
   ```
   Adds a new employee to the database.

4. **Delete an employee**:  
   **Method**: `DELETE`  
   **Endpoint**: `/emp/{empId}`  
   Deletes an employee by their `empId`.

5. **Update an employee**:  
   **Method**: `PUT`  
   **Endpoint**: `/emp`  
   **Request Body Example**:
   ```json
   {
     "empId": 5,
     "name": "E",
     "department": "HR",
     "salary": 60000
   }
   ```
   Updates an existing employee's details.

## Technologies Used

1. **Java**: The primary language used to build the application.
2. **Spring Boot**: To create a RESTful web service.
3. **JPA (Java Persistence API)**: For ORM (Object-Relational Mapping) to handle database operations.
4. **JDBC (Java Database Connectivity)**: To connect with the MySQL database and perform raw SQL queries.
5. **MySQL**: Database used to store employee data.

## Prerequisites

Before running the project, ensure you have the following installed:

1. **Java 8 or later**
2. **Maven** (for building the project)
3. **MySQL** (for the database)

## Running the Project

1. Clone the repository.
2. Set up MySQL with the correct database.
3. Configure the MySQL connection in the `application.properties` file:

   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/your_database
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   spring.jpa.hibernate.ddl-auto=update

   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true
    ```
4. Run the application using your preferred IDE or the command:
   ```bash
   mvn spring-boot:run
   ```
   
5. Use tools like Postman or cURL to interact with the REST endpoints.

## Endpoints

| Method | Endpoint       | Description                  |
|--------|----------------|------------------------------|
| GET    | `/allemp`      | Get all employees            |
| GET    | `/emp/{empId}` | Get employee by ID           |
| POST   | `/emp`         | Add a new employee           |
| DELETE | `/emp/{empId}` | Delete an employee by ID     |
| PUT    | `/emp`         | Update an employee's details |

