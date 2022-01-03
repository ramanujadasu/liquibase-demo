package com.liquibase.repositories;

import org.springframework.data.repository.CrudRepository;

import com.liquibase.entities.Company;

public interface CompanyRepository extends CrudRepository<Company, Integer> {

}
