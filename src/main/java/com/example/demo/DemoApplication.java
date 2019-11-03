package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import javax.persistence.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.transaction.annotation.*;
import java.util.*;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	MyDatabaseConnection connection;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

	}

	@Transactional //
	public void run(String[] args) throws Exception {
		Circle c = new Circle();
		c.setRadius(2);

		connection.save(c);
		connection.findByRadiusOrderByIdDesc(2)
					.forEach(System.out::println);
	}

}
