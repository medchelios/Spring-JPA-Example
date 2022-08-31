package com.example.student_jpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StudentJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentJpaApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student andrey = new Student(
                    "Andrey",
                    "Acosta R",
                    "andreyacost24ra18@gmail.com",
                    19
            );
            Student carlos = new Student(
                    "Carlos",
                    "Acosta R",
                    "carlos18@gmail.com",
                    20
            );
            Student maryangel = new Student(
                    "Maryangel",
                    "Calderon R",
                    "maryangel24@gmail.com",
                    25
            );
            studentRepository.save(andrey);
            studentRepository.save(carlos);
            studentRepository.save(maryangel);
        };
    }

}
