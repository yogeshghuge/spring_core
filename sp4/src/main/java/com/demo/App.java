package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.StudentDao;
import com.model.Student;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new  ClassPathXmlApplicationContext("bean.xml");
        StudentDao sd=context.getBean(StudentDao.class);
        
       /* insert 
         Student s1=new Student();
        s1.setName("Mahesh");
        s1.setCity("Wasadi");
        s1.setPercentage(77.60);
        System.out.println(sd.insertStudent(s1));*/
        
       /* delete 
        *  System.out.println(sd.deleteStudentById(1));
        */
        
        
    }
}
