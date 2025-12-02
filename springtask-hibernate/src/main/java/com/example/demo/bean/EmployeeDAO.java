package com.example.demo.bean;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeDAO {

	@Autowired
    private SessionFactory sessionFactory;

    // Save Employee
    public void saveEmployee(EmployeeBean e) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(e);  // Save or update the employee object
    }

    // Get Employee by ID
    public EmployeeBean getEmployeeById(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(EmployeeBean.class, id);  // Fetch employee by ID
    }

    // Get all Employees
    public List<EmployeeBean> getAllEmployees() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Employee", EmployeeBean.class).getResultList();  // Fetch all employees
    }
	
}
