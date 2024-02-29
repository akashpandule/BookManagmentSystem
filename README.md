# Book Management System

## Overview
The Book Management System is a Spring Boot application that facilitates the management of books. It provides functionalities to perform CRUD (Create, Read, Update, Delete) operations on book records stored in a MySQL database. This project utilizes Spring Web, Thymeleaf, Spring Data JPA, and MySQL to implement the necessary features.

## Features
- **CRUD Operations**: Perform Create, Read, Update, and Delete operations on book records.
- **RESTful APIs**: Exposes RESTful APIs to interact with the system programmatically.
- **MySQL Database**: Stores book data in a MySQL database.
- **Spring Framework**: Utilizes Spring Boot and Spring Web for efficient development.
- **Thymeleaf**: Implements server-side HTML templating for web-based interactions.
- **Exception Handling**: Custom exception handling for better error management.

## Project Structure
The project follows a standard Spring Boot project structure:
- `com.BookManagmentSystem.controller`: Contains controller classes to handle HTTP requests.
- `com.BookManagmentSystem.model`: Defines entity classes representing the book data model.
- `com.BookManagmentSystem.repository`: Contains repository interfaces for database operations.

## API Endpoints
- **GET** `/bookmanagment/books`: Retrieves all books in JSON format.
- **GET** `/bookmanagment/getbook/{id}`: Retrieves a book by ID.
- **POST** `/bookmanagment/insertdata`: Adds a new book.
- **PUT** `/bookmanagment/updated/{id}`: Updates a book by ID.
- **DELETE** `/bookmanagment/deleted/{id}`: Deletes a book by ID.

## Setup and Usage
1. Clone the repository:
    ```bash
    git clone <repository_url>
    ```
2. Navigate to the project directory:
    ```bash
    cd BookManagmentSystem
    ```
3. Configure database properties in `application.properties`.
4. Build the project:
    ```bash
    mvn clean install
    ```
5. Run the application:
    ```bash
    java -jar target/BookManagmentSystem.jar
    ```

## Contributing
Contributions are welcome! If you have suggestions, bug reports, or feature requests, please submit an issue or a pull request.

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contact
For any inquiries or support, please contact [akashpandule2000@gmail.com].
