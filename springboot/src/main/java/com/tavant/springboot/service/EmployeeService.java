package com.tavant.springboot.service;

import java.util.List;
import java.util.Optional;

import com.tavant.springboot.exception.InvalidNameException;
import com.tavant.springboot.exception.InvalidSalaryException;
import com.tavant.springboot.model.Employee;

public interface EmployeeService {
	public boolean addEmployee(Employee emp);
	public Optional<Employee> updateEmployee(String empId , Employee employee) 
			throws InvalidSalaryException , InvalidNameException;
	public Optional<List<Employee>> getEmployees();
	public Optional<Employee> deleteEmploye(String empid);
	
	
	Optional<Employee> getEmployeeById(int empid);
	boolean isExists(int empId);
	
	public Employee findTopByOrderByJobTitleDesc();
	// 
}
