package com.hari.springprojects.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hari.springprojects.entity.Employee;
import com.hari.springprojects.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> getAllEmps() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmployee(Integer empId) {
		return employeeRepository.findById(empId).get();
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		Employee emp = employeeRepository.findById(employee.getEmpId()).get();
		emp.setSalary(employee.getSalary());
		return employeeRepository.save(emp);
	}

	@Override
	public String deleteEmployee(Integer empId) {
		employeeRepository.deleteById(empId);
		return "Employee deleted successfully";
	}
	
	

}
