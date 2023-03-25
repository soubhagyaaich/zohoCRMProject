package com.zohocrmProject.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailServiceImp implements EmailService {

	@Autowired
	private JavaMailSender javaMailSender;
	
	@Override
	public void sendToEmail(String to, String subject, String message) {
		SimpleMailMessage msg=new SimpleMailMessage();
		msg.setTo(to);
		msg.setSubject(subject);
		msg.setText(message);
		javaMailSender.send(msg);
	}
	

}
