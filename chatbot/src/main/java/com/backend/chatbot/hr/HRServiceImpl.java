package com.backend.chatbot.hr;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
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


	public boolean sendEmail(String question, String answer, String email) throws MessagingException, AddressException {
		try {
			Properties props = new Properties();
			props.put("mail.smtp.auth", "true");
			props.put("mail.smtp.starttls.enable", "true");
			props.put("mail.smtp.host", "smtp.gmail.com");
			props.put("mail.smtp.port", "587");
			Session session = Session.getInstance(props, new javax.mail.Authenticator() {
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication("reddyneekshitha@gmail.com", "#neekreddy5522");
				}
			});
			Message msg = new MimeMessage(session);
			msg.setFrom(new InternetAddress("reddyneekshitha@gmail.com", false));

			msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(email));
			msg.setSubject("Response To your Question : " + question);
			msg.setContent(answer, "text/html");
			msg.setSentDate(new Date());
			Transport.send(msg);

			return true;
		}
		catch (Exception e){
			return false;
		}
	}
}
class ResponseToQuery{
	String question;
	String answer;

}
