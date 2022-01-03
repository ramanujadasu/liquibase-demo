package com.liquibase.services;

import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.liquibase.entities.Employee;
import com.liquibase.repositories.EmployeeRepository;

@Component
public class EmployeeServiceImpl implements EmployeeService {

  private EmployeeRepository employeesRepository;

  @Autowired
  public EmployeeServiceImpl(EmployeeRepository employeesRepository) {
    this.employeesRepository = employeesRepository;
  }

  @Override
  public Stream<Employee> getAllEmployees() {
    return StreamSupport.stream(employeesRepository.findAll().spliterator(), true);
  }
}
