package com.backend.chatbot.hr;

import java.util.List;

public interface HRService {
	public List<HR> getAllHRs();
	public HR getHRById(Long id);
	public void saveOrUpdate(HR e);
	public HR getByEmail(String email);

}
