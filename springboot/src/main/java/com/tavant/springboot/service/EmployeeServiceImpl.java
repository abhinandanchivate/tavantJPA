package com.tavant.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tavant.springboot.dao.EmployeeDao;
import com.tavant.springboot.exception.InvalidNameException;
import com.tavant.springboot.exception.InvalidSalaryException;
import com.tavant.springboot.model.Employee;
@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao employeeDAO;
	@Override
	public boolean addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		Employee employee = employeeDAO.save(emp);
		// to insert a record into a table 
		return employee!=null;
	}

	@Override
	public Optional<Employee> updateEmployee(String empId, Employee employee)
			throws InvalidSalaryException, InvalidNameException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<List<Employee>> getEmployees() {
		// TODO Auto-generated method stub
		return Optional.ofNullable(employeeDAO.findAll());
	}

	@Override
	public Optional<Employee> deleteEmploye(String empid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Employee> getEmployeeById(int empid) {
		// TODO Auto-generated method stub
		return employeeDAO.findById(empid);
	}

	@Override
	public boolean isExists(int empId) {
		// TODO Auto-generated method stub
		return employeeDAO.existsById(empId);
	}

	@Override
	public Employee findTopByOrderByJobTitleDesc() {
		// TODO Auto-generated method stub
		return employeeDAO.findTopByOrderByJobTitleDesc();
	}

	


		
	
}
