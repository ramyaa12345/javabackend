package com.backend.chatbot.employee;

import java.util.List;

public interface EmployeeService {
	public List<Employee> getAllEmployees();
	public Employee getEmployeeById(Long id);
	public void saveOrUpdate(Employee e);
	public Employee getByEmail(String email);
}
