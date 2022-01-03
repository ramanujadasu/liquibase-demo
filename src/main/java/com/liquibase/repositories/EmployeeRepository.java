package com.liquibase.repositories;

import org.springframework.data.repository.CrudRepository;

import com.liquibase.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
