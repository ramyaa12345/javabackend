package com.backend.chatbot.hr;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;
import java.util.List;

public interface HRService {
	public List<HR> getAllHRs();
	public HR getHRById(Long id);
	public void saveOrUpdate(HR e);
	public HR getByEmail(String email);
	public Boolean sendEmail(String question, String answer, String email, int id) throws MessagingException, AddressException;

}
