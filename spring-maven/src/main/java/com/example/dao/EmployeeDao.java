package com.example.dao;

//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.bean.EmployeeBean;

@Repository
public class EmployeeDao {
@Autowired 
private JdbcTemplate jdbcTemplate;
public int addEmployee(EmployeeBean eb) {
	return jdbcTemplate.update("insert into employee values('"+eb.getEid()+"','"+eb.getEname()+"','"+eb.getEsal()+"')");
}
public int updateEmployee(EmployeeBean eb) {
	return jdbcTemplate.update("update employee set name='"+eb.getEname()+"',salary='"+eb.getEsal()+"' where id='"+eb.getEid()+"'");
}
public int deleteEmployee(EmployeeBean eb) {
	return jdbcTemplate.update("delete from employee where id='"+eb.getEid()+"'");
}
//public ArrayList<EmployeeBean> selectAll()
//{
//ArrayList<EmployeeBean> al=new ArrayList<EmployeeBean>();
//jdbcTemplate.query("select * from employee", new RowMapper<EmployeeBean>() {
//@Override
//public EmployeeBean mapRow(ResultSet rs, int rowNum) throws SQLException {
//EmployeeBean e=new EmployeeBean();
//e.setEid(rs.getInt(1));
//e.setEname(rs.getString(2));
//e.setEsal(rs.getInt("salary"));
//al.add(e);
//return e;
//}
//});
//return al;
//}
//public EmployeeBean selectById(int id)
//{
//EmployeeBean e=new EmployeeBean();
//jdbcTemplate.query("select * from employee where id="+id, new RowMapper<EmployeeBean>() {
//@Override
// public EmployeeBean mapRow(ResultSet rs, int rowNum) throws SQLException {
//e.setEid(rs.getInt(1));
//e.setEname(rs.getString(2));
//e.setEsal(rs.getInt(3));
//return e;
//}
//});
//return e;
//}
}
