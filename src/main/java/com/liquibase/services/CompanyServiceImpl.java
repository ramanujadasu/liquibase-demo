package com.liquibase.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.liquibase.entities.Company;
import com.liquibase.repositories.CompanyRepository;

import java.util.stream.Stream;
import java.util.stream.StreamSupport;

@Component
public class CompanyServiceImpl implements CompnayService {

    private CompanyRepository companyRepository;

    @Autowired
    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public Stream<Company> getCompanies() {
        return StreamSupport.stream(companyRepository.findAll().spliterator(), true);
    }
}
