# Project preview
The "api-rest-poo" is a Java-based RESTful API developed using Spring Boot and PostgreSQL. It is designed to be used by confectioners to manage their product inventory effectively, as a part of a college assignment. The API provides essential CRUD (Create, Read, Update, Delete) operations through the /product endpoint.

# Introduction
The project was developed as part of a college assignment, aiming to create a real-use back-end system with a focus on learning the functioning and creation of an API from scratch.

# Features
- Product Management: Add, retrieve, update, and delete product records.

# Database Schema
The PostgreSQL database schema includes the following table:
- product: Stores product information, including product ID, name, quantity, price, stock and date.

# API Endpoints
The API provides the following endpoints:

- GET /product: Retrieve a list of all products.
- GET /product/{id}: Get details of a specific product by ID.
- POST /product: Add a new product.
- PUT /product/{id}: Update product details.
- DELETE /product/{id}: Delete a product.

# Usage
The API can be accessed using any API testing tool or client like Postman or cURL. To interact with the API, make HTTP requests to the appropriate endpoints based on the desired operation.

For example:
1. To add a new product, make a POST request to /product with the product data in the request body.
2. To retrieve a list of all products, perform a GET request to /product.
3. To update product details, send a PUT request to /product/{id} with the product ID in the URL and the updated product data in the request body.
4. To delete a product, make a DELETE request to /product/{id} with the product ID in the URL.

# Technologies Used
- Java
- Spring Boot
- PostgreSQL
