package com.backend.chatbot.hr;

import org.junit.jupiter.api.Test;

import javax.mail.MessagingException;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HRServiceImplTest {
    HRServiceImpl hrServiceImpl = new HRServiceImpl();
    @Test
    void sendMailTest() throws MessagingException {
        String query  = "what is name?";
        String answer = "name is nikhil";
        String email = "sainikhil027@gmail.com";
        assertTrue(hrServiceImpl.sendEmail(query, answer, email, 2));
//        assertFalse(hrServiceImpl.sendEmail(query, answer, "sainikhil818134"));
    }
}
