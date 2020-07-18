package org.ahmedgaber.springboot.crud.dao;

import java.util.List;

import org.ahmedgaber.springboot.crud.entity.Employee;

public interface EmployeeDAO {
	
	public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int theId);

}
