package org.ahmedgaber.springboot.crud.service;

import java.util.List;

import org.ahmedgaber.springboot.crud.entity.Employee;

public interface EmployeeService {
	
	public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int theId);
}
