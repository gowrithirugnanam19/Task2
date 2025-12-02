package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.StudentBean;

@Repository
public interface StudentDao extends JpaRepository<StudentBean,Integer>{

}
