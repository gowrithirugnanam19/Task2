package com.example.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class GreetingsService {

	@Value("${app.message}")
    private String msg;

    public String greet() {
        return "Welcome to Spring Boot! " + msg;
    }
}
