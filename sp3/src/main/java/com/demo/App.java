package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.StudentDao;
import com.model.Student;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context= new ClassPathXmlApplicationContext("bean.xml");
       StudentDao sd= context.getBean(StudentDao.class);
    	
       Student s1= new Student();
       s1.setName("Manoj");
       s1.setCity("Warje");
       s1.setPerceentage(56.23);
       System.out.println(sd.inserStudent(s1));
    }
}
