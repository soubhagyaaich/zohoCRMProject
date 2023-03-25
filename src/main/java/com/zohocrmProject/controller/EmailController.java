package com.zohocrmProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrmProject.dto.EmailDto;
import com.zohocrmProject.util.EmailService;

@Controller
public class EmailController {
	
	@Autowired
	private EmailService emailService;
	
	
	@PostMapping("/sendEmail")
	public String sendEmail(@RequestParam("email")String email,Model model) {
		model.addAttribute("email",email);
		return "EmailSendPage";
	}
	
	@PostMapping("/triggerEmail")
	public String triggerEmail(EmailDto emailDto,Model model) {
		emailService.sendToEmail(emailDto.getEmail(), emailDto.getSubject(), emailDto.getContent());
		model.addAttribute("msg","Send Message...");
		return "EmailSendPage";
	}

}
