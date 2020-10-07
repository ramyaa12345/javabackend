package com.backend.chatbot.hr;

import java.util.ArrayList;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class HRServiceImpl implements HRService{
	@Autowired
	HRRepository er;

	@Override
	public List<HR> getAllHRs() {
		return (List<HR>)er.findAll();
	}

	@Override
	public HR getHRById(Long id) {
			return er.findById(id).get();
	}

	@Override
	public void saveOrUpdate(HR e) {
		er.save(e);
		
	}
	
	@Override
	public HR getByEmail(String email) {
		List<HR> employees=new ArrayList<>();
		employees=getAllHRs();
		for(HR e:employees) {
			String s=e.getEmailId();
			if(s.contentEquals(email)) {
				return e;
			}
		}
		return null;
	}
	
	

}
