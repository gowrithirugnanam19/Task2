package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.StudentBean;
import com.example.demo.dao.StudentDao;

@Service
public class StudentService {
	@Autowired
	private StudentDao sdao;
	public int addStudent(StudentBean s) {
		if(s!=null) {
			sdao.save(s);
			return 1;
		}
		else {
			return 0;
		}
	}
	
	public List<StudentBean> selectAll(){
		return sdao.findAll();
	}
}
