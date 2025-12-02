package com.example.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value="eb") //without this it throws an error such as unqualifying or no data connection
//@Scope(value="singleton")//same answer will display two times because we specify only one values
@Scope(value="prototype") // for the second value we dont set values so it print null 
public class EmployeeBean {
private int eid;
private String ename;
private int esal;
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public int getEsal() {
	return esal;
}
public void setEsal(int esal) {
	this.esal = esal;
}
@Override
public String toString() {
	return "EmployeeBean [eid=" + eid + ", ename=" + ename + ", esal=" + esal + "]";
}

}
