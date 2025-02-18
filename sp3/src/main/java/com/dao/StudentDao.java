package com.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.model.Student;

public class StudentDao {
	
	private JdbcTemplate j;
	
	public void setJ(JdbcTemplate j) {
		this.j = j;
	}

	public int inserStudent(Student s)
	{
		String sql="insert into Student(name,city,percentage)values(?,?,?)";
		return j.update(sql, new object[] { s.getName(),s.getCity(),s.getPerceentage() });
	}

}
