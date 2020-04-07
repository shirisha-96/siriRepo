package com.siri.springbootapiex.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siri.springbootapiex.model.Employee;
import com.siri.springbootapiex.repository.EmployeeRepository;

@Service
public class EmployeeDAO {
@Autowired
EmployeeRepository employeeRepository;

/* to save an employee*/
public Employee save(Employee emp)
{
	return employeeRepository.save(emp);
}
/*search all employees*/
public List<Employee> findAll()
{
	return employeeRepository.findAll();
}
/* get/update an employee*/
public Employee findOneEmp(Long empid)
{
	return employeeRepository.findOne(empid);
}
/*delete an employee*/
public void deleteEmp(Employee emp)
{
	employeeRepository.delete(emp);
}
}
