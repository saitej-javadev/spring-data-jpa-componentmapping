package com.saitej.springdatajpacomponentmapping.repos;

import com.saitej.springdatajpacomponentmapping.entities.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee,Integer> {
}
