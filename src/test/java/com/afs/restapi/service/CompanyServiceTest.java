package com.afs.restapi.service;

import com.afs.restapi.repository.CompanyJpaRepository;
import com.afs.restapi.repository.EmployeeJpaRepository;
import org.junit.jupiter.api.BeforeEach;

import static org.mockito.Mockito.mock;

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

}
