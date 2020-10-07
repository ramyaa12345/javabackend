package com.backend.chatbot.hr;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins="http://localhost:4200")
@RestController
public class HRController {
	@Autowired
	HRService es;
	@GetMapping("/HRlist")
	public List<HR> getAll(){
		return es.getAllHRs();
	}
	
	@GetMapping("/HR/{id}")
	public HR getById(@PathVariable Long id) {
		return es.getHRById(id);
	}
	
	@GetMapping("/getHR/{email}")
	public HR getByEmail(@PathVariable String email) {
		return es.getByEmail(email);
		
	}
	
	
	
}
