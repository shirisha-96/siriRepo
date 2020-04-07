package com.siri.springbootapiex.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.siri.springbootapiex.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
