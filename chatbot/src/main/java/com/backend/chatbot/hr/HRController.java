package com.backend.chatbot.hr;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.mail.MessagingException;


@CrossOrigin()
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

	@PostMapping("/respond")
	public Boolean respond(@RequestBody ResponseToQuery responseToQuery) throws MessagingException {
		return es.sendEmail(responseToQuery.getQuestion(), responseToQuery.getAnswer(), responseToQuery.getEmail(), responseToQuery.getQid());

	}
	
	
	
}
