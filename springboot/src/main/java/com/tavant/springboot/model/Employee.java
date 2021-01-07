package com.tavant.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity// want to utilize for ORM mapping purpose
// this thing can be informed by @Entity
// if we are not providing the Entity name then it will 
// take default class name as an entity name
// if we are not providing the @table annotation(which is used to provide the 
// table name ) then it will take entity name as a table name
@Table(name ="employees")
public class Employee  {
	
	@Id // this annotation will be marked on primary key column
	@Column(name="employeeNumber")
	private Integer employeeNumber;
	
	private String firstName;
	private String lastName;
	
	private String extension;
	
	
	private String email;
	private String officeCode;
	private Integer reportsTo;
	private String jobTitle;
	
	
}
