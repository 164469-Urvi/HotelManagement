# Hotel Management

A Spring Boot REST API for managing hotel records.

## Requirements

- Java 21
- MySQL

Create a database named `hotel_management` in MySQL. Configure the database user with environment variables before starting the application:

```powershell
$env:DB_USERNAME = "your-mysql-username"
$env:DB_PASSWORD = "your-mysql-password"
```

If MySQL is not running on the default host and port, set `DB_URL` to a JDBC URL such as `jdbc:mysql://localhost:3306/hotel_management`.

## Run

```powershell
.\mvnw.cmd test
.\mvnw.cmd spring-boot:run
```

The API is available under `/hotel`:

- `POST /hotel` - create a hotel
- `GET /hotel` - list hotels
- `GET /hotel/{id}` - get a hotel
- `PUT /hotel/{id}` - update a hotel
- `DELETE /hotel/{id}` - delete a hotel

Hotel JSON fields are `hotelName`, `city`, `rating`, and `availableRooms`.
