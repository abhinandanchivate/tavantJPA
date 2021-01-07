package com.tavant.springboot.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tavant.springboot.exception.InvalidNameException;
import com.tavant.springboot.exception.InvalidSalaryException;
import com.tavant.springboot.model.Employee;
@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer>{
// the implementation will be written by spring data jpa.

	public Employee findTopByOrderByJobTitleDesc();// we will get max
	public Employee findTopByOrderByJobTitleAsc(); // min record
	
	//              select * from Employee orderby jobTitle desc limit 1;

	// 1st max 3 salaries
	public Optional<List<Employee>> findTop3ByOrderByJobTitleDesc();
	public Optional<List<Employee>> findTop3ByOrderByJobTitleAsc();
	
	public Optional<List<Employee>> findByOfficeCode(String officeCode);
	// 
}
