package com.example.todotest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class TodoTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(TodoTestApplication.class);
    }
}
