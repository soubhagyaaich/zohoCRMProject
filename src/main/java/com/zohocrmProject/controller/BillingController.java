package com.zohocrmProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrmProject.entity.Billing;
import com.zohocrmProject.entity.Contact;
import com.zohocrmProject.services.BillingService;
import com.zohocrmProject.services.ContactService;

@Controller
public class BillingController {
	
	@Autowired
	private ContactService contactService;
	@Autowired
	private BillingService billingService;
	
	@RequestMapping("/billing")
	public String billingData(@RequestParam("id")Long id,Model model) {
		Contact findByContact = contactService.findByContact(id);
		model.addAttribute("findByContact", findByContact);
		return "Billing";
	}
	
	@RequestMapping("/billingForm")
	public String billGenerated(@ModelAttribute("billing")Billing billing) {
		billingService.saveBilling(billing);
		return "";
	}
}
