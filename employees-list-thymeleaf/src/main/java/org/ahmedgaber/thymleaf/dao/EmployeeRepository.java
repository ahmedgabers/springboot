package org.ahmedgaber.thymleaf.dao;

import java.util.List;

import org.ahmedgaber.thymleaf.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	public List<Employee> findAllByOrderByLastNameAsc();

}
