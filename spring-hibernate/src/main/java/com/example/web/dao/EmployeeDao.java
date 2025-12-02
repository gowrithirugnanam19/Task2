package com.example.web.dao;
import java.util.List;

//import com.example.web.controller.EmployeeController;
//import com.example.web.service.EmployeeService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
//import com.example.web.SpringHibernateApplication;
import com.example.web.bean.EmployeeBean;

@Repository
public class EmployeeDao {
@Autowired
private SessionFactory sessionFactory;
public int addEmployee(EmployeeBean eb) {
	Session s=sessionFactory.openSession();
	Transaction t=s.beginTransaction();
	if(eb!=null) {
		s.persist(eb);
		t.commit();
		return 1;
	}
	else {
		return 0;
	}
}
public int updateEmployee(EmployeeBean eb) {
	Session s=sessionFactory.openSession();
	Transaction t=s.beginTransaction();
	if(eb!=null) {
		s.merge(eb);
		t.commit();
	    System.out.println("Session Updated Successfully");
	    return 1;
	}
	else {
		return 0;
	}
}
public int deleteEmployee(int id) {
	Session s=sessionFactory.openSession();
	Transaction t=s.beginTransaction();
	EmployeeBean e=(EmployeeBean)s.get(EmployeeBean.class,new Integer(id));
	if(e!=null) {
		s.remove(e);
		t.commit();
		System.out.println("Session Deleted Successfully");
		return 1;
	}
	else {
		return 0;
	}
}
public List<EmployeeBean> selectAllEmployee(){
	Session s=sessionFactory.openSession();
	List<EmployeeBean> all;
	Query q=s.createQuery("from EmployeeBean");
	all=q.list();
	return all;
	
}
}
