package org.ahmedgaber.springboot.crud.dao;

import org.ahmedgaber.springboot.crud.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
