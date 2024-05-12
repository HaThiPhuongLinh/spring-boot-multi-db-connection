# Spring Boot Multiple Database Connection Example

> This is a sample Spring Boot project demonstrating how to connect to two databases using Spring Boot.

## Technologies Used

- Spring Boot
- Spring Data JPA
- MariaDB

## Database Configuration

This project uses two databases:
- `db1`: The primary database
- `db2`: The secondary database

Before running the project, you need to create two databases in MariaDB. 

The `db1` database will contain a table named `student` with two columns `id` and `name`. 

The `db2` database will contain a table named `orders` with two columns `id` and `quantity`.

You also need to manually add data to these tables.

And make sure to update the database configurations in `src/main/resources/application.properties` with your database details. 

This is my database configurations
```js
spring.application.name=multiple-database-spring
spring.datasource.driver-class-name=org.mariadb.jdbc.Driver

# db1
spring.db1.datasource.url=jdbc:mariadb://localhost:3306/db1
spring.db1.jpa.show-sql = true
spring.db1.datasource.username=root    //change it
spring.db1.datasource.password=123456  //change it
spring.db1.jpa.hibernate.ddl-auto=update


# db2
spring.db2.datasource.url=jdbc:mariadb://localhost:3306/db2
spring.db2.jpa.show-sql = true
spring.db2.datasource.username=root      //change it
spring.db2.datasource.password=123456    //change it
spring.db2.jpa.hibernate.ddl-auto=update

```




