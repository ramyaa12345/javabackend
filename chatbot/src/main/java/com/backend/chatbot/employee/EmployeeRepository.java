package com.backend.chatbot.employee;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface EmployeeRepository extends CrudRepository<Employee,Long>{

	

}
