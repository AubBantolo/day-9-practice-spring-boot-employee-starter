package com.afs.restapi.service;

import com.afs.restapi.entity.Company;
import com.afs.restapi.repository.CompanyJpaRepository;
import com.afs.restapi.repository.EmployeeJpaRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CompanyServiceTest {

    private CompanyService companyService;
    private CompanyJpaRepository mockedCompanyRepository;
    private EmployeeJpaRepository mockedEmployeeRepository;
    @BeforeEach
    void setUp() {
        mockedCompanyRepository = mock(CompanyJpaRepository.class);
        mockedEmployeeRepository = mock(EmployeeJpaRepository.class);
        companyService = new CompanyService(mockedCompanyRepository, mockedEmployeeRepository);
    }

    @Test
    void should_return_all_companies_when_get_companies_given_companies_service() {
        // Given
        Company company = new Company("Spring");
        List<Company> companies = List.of(company);
        when(mockedCompanyRepository.findAll()).thenReturn(companies);

        // When
        List<Company> allCompanies = companyService.findAll();

        // Then
        assertEquals(allCompanies.get(0).getId(), company.getId());
        assertEquals(allCompanies.get(0).getName(), company.getName());
    }
}