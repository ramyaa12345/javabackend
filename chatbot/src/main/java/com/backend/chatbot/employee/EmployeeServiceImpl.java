package com.backend.chatbot.employee;

import java.util.ArrayList;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	EmployeeRepository er;

	@Override
	public List<Employee> getAllEmployees() {
		return (List<Employee>)er.findAll();
	}

	@Override
	public Employee getEmployeeById(Long id) {
			return er.findById(id).get();
	}

	@Override
	public void saveOrUpdate(Employee e) {
		er.save(e);
		
	}
	
	@Override
	public Employee getByEmail(String email) {
		List<Employee> employees=new ArrayList<>();
		employees=getAllEmployees();
		for(Employee e:employees) {
			String s=e.getEmailId();
			if(s.contentEquals(email)) {
				return e;
			}
		}
		return null;
	}
	
	

}
