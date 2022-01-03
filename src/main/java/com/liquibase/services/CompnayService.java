package com.liquibase.services;

import java.util.stream.Stream;

import com.liquibase.entities.Company;

public interface CompnayService {
    Stream<Company> getCompanies();
}
