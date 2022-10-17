package com.naumen.aircraftflightsearch.service.impl;

import com.naumen.aircraftflightsearch.entity.Company;
import com.naumen.aircraftflightsearch.repository.CompanyRepository;
import com.naumen.aircraftflightsearch.service.CompanyService;
import org.springframework.stereotype.Service;

@Service
public class CompanyServiceImpl implements CompanyService {

    private final CompanyRepository companyRepository;

    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public Company getCompanyById(Long id) {
        return companyRepository.findById(id).get();
    }
}