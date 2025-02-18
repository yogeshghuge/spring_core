package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.config.MyConfiguration;
import com.model.Student;

public class App 
{
    public static void main( String[] args )
    {
       /* ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
        Student s1=context.getBean("s1", Student.class);
        System.out.println(s1);*/
    	
    	//BeanFactory
    	/*Resource r=new ClassPathResource("bean.xml");
    	BeanFactory factory=new XmlBeanFactory(r);
    	Student s1=factory.getBean(Student.class);
    	System.out.println(s1);*/
    	
    	//ApplicationContet
    	/*ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
    	Student s1=context.getBean(Student.class);
    	System.out.println(s1);*/
    	
    	//setter injection bean file
    	/*<property name="name" value="Yogesh"></property>
		<property name="id" value="10"></property>
		<property name="city" value="Pune"></property>
		<property name="percentage" value="56.67"></property>*/
	

    	//setter injection with primitive datatype 
    	/*<property name="name" value="Yogesh"></property>
		<property name="id" value="10"></property>
		<property name="city" value="Pune"></property>
		<property name="percentage" value="56.67"></property>*/
    	
    	//setter injection with array
    	// <property name="marks" value="10,20,30,40,50"></property>
    			//or
    	/*<property name="marks">
		<list>
			<value>10</value>
			<value>20</value>
			<value>30</value>
			<value>40</value>
			<value>50</value>
		</list>
	</property>*/
    	
    	//setter injection with Collection of non-primitive 
    	/*<property name="address" ref="a1"></property>
    	</bean>
    	<bean id="a1" class="com.model.Address">
    	<property name="line1" value="sector 24A"></property>
    	<property name="line2" value="national state"></property>
    	<property name="city" value="Gurugram"></property>
    	<property name="state" value="Delhi"></property>
    	</bean>*/
    	
    	//setter injection with list of non-primitive
    	/*<bean id="s1" class="com.model.Student">
		<property name="addresses">
		<list>
			<ref bean="a1"/>
			<ref bean="a2"/>
		</list>
		</property>
		</bean>
	
	<bean id="a1" class="com.model.Address">
	<property name="line1" value="sector 24A"></property>
	<property name="line2" value="national state"></property>
	<property name="city" value="Gurugram"></property>
	<property name="state" value="Delhi"></property>
	</bean>
	
	<bean id="a2" class="com.model.Address">
	<property name="line1" value="sector 17B"></property>
	<property name="line2" value=""></property>
	<property name="city" value="Gurugram"></property>
	<property name="state" value="Delhi"></property>
	</bean>
	</beans*/

    	//setter injection with Map property
    	/*<bean id="s1" class="com.model.Student">
  		<property name="details">
  			<map>
  				<entry key="hobbies">
  					<list>
  						<value>cricket</value>
  						<value>Hockey</value>
  						<value>Traveling</value>
  						<value>Reading</value>
  					</list>
  				</entry>
  				<entry key="color">
  					<list>
  						<value>Black</value>
  						<value>Red</value>
  						<value>Blue</value>
  						<value>White</value>
  						<value>wine</value>
  					</list>
  				</entry>
  			</map>
  		</property>
  	</bean>*/
  
   	ApplicationContext context= new ClassPathXmlApplicationContext("bean.xml");
   	Student s1=context.getBean(Student.class);
   	 System.out.println(s1);
    	
    	
    	
    }
}
