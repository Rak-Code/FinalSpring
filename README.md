### **Clothing E-Commerce Application**

#### **Overview**
This is a Spring Boot-based e-commerce application designed to manage clothing products, orders, users, and categories. It provides RESTful APIs for performing CRUD operations and uses JPA for database interactions. The application is built with Java 23 and leverages technologies like Spring Data JPA, MySQL, and Lombok.

---

### **Features**
1. **Product Management**:
   - Create, retrieve, update, and delete products.
   - Products include attributes like name, price, size, color, and category.

2. **Order Management**:
   - Create, retrieve, and update orders.
   - Orders include details like user, order date, total amount, and status.

3. **Category Management**:
   - Create, retrieve, update, and delete categories.
   - Categories include attributes like name and description.

4. **User Management**:
   - Create, retrieve, and list users.
   - Users include attributes like first name, last name, email, and address.

5. **Validation**:
   - Input validation using annotations like `@NotBlank`, `@Email`, and `@Positive`.

6. **Database Integration**:
   - Uses Spring Data JPA for ORM and MySQL as the database.

7. **Lombok**:
   - Reduces boilerplate code with Lombok annotations.

---

### **Technologies Used**
- **Spring Boot**: Framework for building the application.
- **Spring Data JPA**: For database interactions.
- **MySQL**: Database for storing application data.
- **Lombok**: For reducing boilerplate code.
- **Maven**: Build and dependency management tool.

---

### **API Endpoints**

#### **Product Controller**
- `POST /api/products`: Create a new product.
- `GET /api/products/{id}`: Retrieve a product by ID.
- `GET /api/products`: Retrieve all products.
- `PUT /api/products/{id}`: Update a product.
- `DELETE /api/products/{id}`: Delete a product.

#### **Order Controller**
- `POST /api/orders`: Create a new order.
- `GET /api/orders/{id}`: Retrieve an order by ID.
- `GET /api/orders`: Retrieve all orders.
- `PUT /api/orders/{id}/status`: Update the status of an order.

#### **Category Controller**
- `POST /api/categories`: Create a new category.
- `GET /api/categories/{id}`: Retrieve a category by ID.
- `GET /api/categories`: Retrieve all categories.
- `PUT /api/categories/{id}`: Update a category.
- `DELETE /api/categories/{id}`: Delete a category.

#### **User Controller**
- `POST /api/users`: Create a new user.
- `GET /api/users/{id}`: Retrieve a user by ID.
- `GET /api/users`: Retrieve all users.

---

### **Database Schema**
- **Order**: `id`, `user_id`, `order_date`, `total_amount`, `status`.
- **OrderItem**: `id`, `order_id`, `product_id`, `quantity`, `price`.
- **Product**: `id`, `name`, `description`, `price`, `size`, `color`, `stock_quantity`, `category_id`.
- **Category**: `id`, `name`, `description`.
- **User**: `id`, `first_name`, `last_name`, `email`, `address`.

---

### **Getting Started**

#### **Prerequisites**
- Java 23
- MySQL
- Maven

#### **Setup**
1. **Clone the Repository**:
   ```bash
   git clone https://github.com/your-repo/clothing-ecommerce.git
   cd clothing-ecommerce
   ```

2. **Configure Database**:
   - Update `application.properties` with your MySQL credentials:
     ```properties
     spring.datasource.url=jdbc:mysql://localhost:3306/clothing
     spring.datasource.username=root
     spring.datasource.password=yourpassword
     spring.jpa.hibernate.ddl-auto=update
     ```

3. **Build the Project**:
   ```bash
   mvn clean install
   ```

4. **Run the Application**:
   ```bash
   mvn spring-boot:run
   ```

5. **Access the APIs**:
   - Use tools like Postman or cURL to interact with the APIs.
   - Example: `http://localhost:8080/api/products`

---

### **Project Structure**
```
src/main/java/com/ecommerce/clothing/
├── controller/          # REST controllers
├── entity/               # JPA entities
├── repository/           # JPA repositories
├── service/              # Service interfaces
└── service/impl/         # Service implementations
```

---

### **Contributing**
Contributions are welcome! Please follow these steps:
1. Fork the repository.
2. Create a new branch (`git checkout -b feature/YourFeature`).
3. Commit your changes (`git commit -m 'Add some feature'`).
4. Push to the branch (`git push origin feature/YourFeature`).
5. Open a pull request.

---

### **License**
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

---

### **Acknowledgments**
- Spring Boot for providing a robust framework.
- Lombok for reducing boilerplate code.
- MySQL for reliable database storage.

---

### **Contact**
For any questions or feedback, please contact:
- **Rakesh Gupta**: [rakeshgupta1361411@gmail.com](mailto:your.email@example.com)

