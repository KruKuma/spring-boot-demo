package com.example.demo.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
    
    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository) {
        return args -> {
            Student mike = new Student(
                    1L,
                    "Mike",
                    "mike.jackson@gmail.com",
                    LocalDate.of(2000, 11, 12)
                    );
            Student james = new Student(
                    "James",
                    "james.samson@gmail.com",
                    LocalDate.of(2000, 10, 12)
                    );
            Student sean = new Student(
                    "Sean",
                    "sean.murphy@gmail.com",
                    LocalDate.of(2004, 1, 23)
                    );
            repository.saveAll(
                    List.of(mike, james, sean)
                    );
        };
    }
}
