package vn.edu.fit.iuh.multipledatabasespring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import vn.edu.fit.iuh.multipledatabasespring.primary.services.StudentService;
import vn.edu.fit.iuh.multipledatabasespring.secondary.services.OrdersService;

@SpringBootApplication
public class MultipleDatabaseSpringApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(MultipleDatabaseSpringApplication.class, args);
    }

    @Autowired
    StudentService studentService;

    @Autowired
    OrdersService ordersService;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Students from primary database: " + studentService.findAll());
        System.out.println("Orders from secondary database: " + ordersService.findAll());
    }
}
