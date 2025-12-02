package com.example.demo.bean;

import com.example.demo.bean.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get EmployeeDAO bean from Spring context
        EmployeeDAO employeeDAO = context.getBean(EmployeeDAO.class);

        // Save new employees
        EmployeeBean employee1 = new EmployeeBean();
        employeeDAO.saveEmployee(employee1);

        EmployeeBean employee2 = new EmployeeBean();
        employeeDAO.saveEmployee(employee2);

        // Fetch all employees
        List<EmployeeBean> employees = employeeDAO.getAllEmployees();
        for (EmployeeBean employee : employees) {
            System.out.println("Employee ID: " + employee.getId() + ", Name: " + employee.getName() + ", Salary: " + employee.getSalary());
        }

        // Fetch employee by ID
        EmployeeBean fetchedEmployee = employeeDAO.getEmployeeById(1);
        System.out.println("Fetched Employee: " + fetchedEmployee.getName());

        // Close Spring context
        ((ClassPathXmlApplicationContext) context).close();
    }
}

