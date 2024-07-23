package com.hari.springprojects.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hari.springprojects.entity.Employee;
import com.hari.springprojects.service.EmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping
	public Employee saveEmployee(@RequestBody Employee employee) {
		return employeeService.saveEmployee(employee);
	}
	
	@GetMapping("/fetch-all")
	public List<Employee> getAllEmps(){
		return employeeService.getAllEmps();
	}
	
	@GetMapping("/fetch")
	public Employee getEmployee(@RequestParam Integer empId){
		return employeeService.getEmployee(empId);
	}
	
	@PutMapping("/update")
	public Employee updateEmployee(@RequestBody Employee employee){
		return employeeService.updateEmployee(employee);
	}
	
	@DeleteMapping("/delete/{empId}")
	public String deleteEmployee(@PathVariable Integer empId) {
		return employeeService.deleteEmployee(empId);
	}
	

}
