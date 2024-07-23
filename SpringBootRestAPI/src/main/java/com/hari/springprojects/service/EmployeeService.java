package com.hari.springprojects.service;

import java.util.List;

import com.hari.springprojects.entity.Employee;

public interface EmployeeService {
	
	public Employee saveEmployee(Employee employee);
	public List<Employee> getAllEmps();
	public Employee getEmployee(Integer empId);
	public Employee updateEmployee(Employee employee);
	public String deleteEmployee(Integer empId);

}
