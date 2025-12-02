package com.example.demo.connection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
    
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        DBConnection dbConnection = context.getBean(DBConnection.class);
        dbConnection.connect();
        context.close();
    }
}
