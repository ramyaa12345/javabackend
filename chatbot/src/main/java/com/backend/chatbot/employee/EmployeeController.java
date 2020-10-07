package com.backend.chatbot.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins="http://localhost:4200")
@RestController
public class EmployeeController {
	@Autowired
	EmployeeService es;
	@GetMapping("/employeeslist")
	public List<Employee> getAll(){
		return es.getAllEmployees();
	}
	
	@GetMapping("/employee/{id}")
	public Employee getById(@PathVariable Long id) {
		return es.getEmployeeById(id);
	}
	
	@PostMapping("/register")
	public Employee save(@RequestBody Employee e) {
		es.saveOrUpdate(e);
		return e;
	}
	
	@GetMapping("/get/{email}")
	public Employee getByEmail(@PathVariable String email) {
		return es.getByEmail(email);
		
	}
	
	
	
}
