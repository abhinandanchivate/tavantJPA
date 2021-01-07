package com.tavant.springboot;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.tavant.springboot.model.Employee;
import com.tavant.springboot.service.EmployeeService;
import com.tavant.springboot.utils.DBUtils;

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringbootApplication.class, args);
	
		Arrays.asList(context.getBeanDefinitionNames()).forEach(System.out::println);
		EmployeeService employeeService = context.getBean(EmployeeService.class);
//		System.out.println(employeeService!=null);
//		Employee employee = new Employee();
//		employee.setEmail("patelvirendra62@gmail.com");
//		employee.setFirstName("Virendra Kumar");
//		employee.setLastName("Patel");
//		employee.setJobTitle("Software Eng.. traineee");
//		employee.setExtension("A");
//		employee.setOfficeCode("1");
//		employee.setReportsTo(1002);
//		employee.setEmployeeNumber(1784);
//		
//		boolean result = employeeService.addEmployee(employee);
//		if(result) {
//			System.out.println("record inserted successfully");
//		}
//		else {
//			System.out.println("problem ");
//		}
//		//DBUtils dbUtils = context.getBean(DBUtils.class);
////		System.out.println(dbUtils.getConnection());
		System.out.println(employeeService.findTopByOrderByJobTitleDesc());
	}

}
