package com.liquibase.services;

import java.util.stream.Stream;

import com.liquibase.entities.Employee;

public interface EmployeeService {
    Stream<Employee> getAllEmployees();
}
