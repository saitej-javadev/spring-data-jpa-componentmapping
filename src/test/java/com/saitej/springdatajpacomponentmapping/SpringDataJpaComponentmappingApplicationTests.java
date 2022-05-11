package com.saitej.springdatajpacomponentmapping;

import com.saitej.springdatajpacomponentmapping.entities.Address;
import com.saitej.springdatajpacomponentmapping.entities.Employee;
import com.saitej.springdatajpacomponentmapping.repos.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringDataJpaComponentmappingApplicationTests {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    void contextLoads() {
    }


    @Test
    void testCreateEmployee() {
        Address address = new Address().builder()
                .streetaddress("Haverhill")
                .city("Boston")
                .state("Massachusetts")
                .country("USA")
                .zipcode("01905").build();

        Employee employee = new Employee().builder()
                .id(123)
                .name("joe")
                .address(address)
                .build();

        employeeRepository.save(employee);
    }
}
