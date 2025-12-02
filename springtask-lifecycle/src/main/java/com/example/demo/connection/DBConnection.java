package com.example.demo.connection;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class DBConnection{
  public  DBConnection(){
     System.out.println("Database Connection: constructor called");
    }
  @PostConstruct
  public void init() {
      System.out.println("DatabaseConnection: Bean Initialized");
  }

  public void connect() {
      System.out.println("DatabaseConnection: Connecting to the database...");
  }
  @PreDestroy
  public void destroy() {
      System.out.println("DatabaseConnection: Bean Destroyed");
  }

  public void closeConnection() {
      System.out.println("DatabaseConnection: Closing the database connection.");
  }
}
