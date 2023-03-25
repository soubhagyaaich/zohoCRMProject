package com.zohocrmProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrmProject.entity.Contact;
import com.zohocrmProject.entity.Lead;
import com.zohocrmProject.services.ContactService;
import com.zohocrmProject.services.LeadService;

@Controller
public class LeadController {
	
	@Autowired
	private LeadService leadService;
	
	@Autowired
	private ContactService contactService;
	
	//http://localhost:8081/viewRegistration
	@RequestMapping("/viewRegistration")
	public String viewRegistrationPage() {
		
		return "Registration";
	}
	
	@PostMapping("/saveRecords")
	public String saveLead(@ModelAttribute("lead")Lead lead,Model model) {
		leadService.saveLeadRecord(lead);
		model.addAttribute("lead",lead);
		return "ShowLeads";
	}
	
	@RequestMapping("/convertRecord")
	public String findLeadId(@RequestParam("id")Long id,Model model) {
		Lead lead=leadService.findByLeadId(id);
		
		Contact contact=new Contact();
		contact.setFirstName(lead.getFirstName());
		contact.setLastName(lead.getLastName());
		contact.setEmail(lead.getEmail());
		contact.setMobile(lead.getMobile());
		contact.setSource(lead.getSource());
		contactService.saveContact(contact);
		leadService.deleteLeadId(id);
		List<Contact> contacts = contactService.getContacts();
		model.addAttribute("contacts", contacts);
		return "AllContacts";
	}
	//http://localhost:8081/allLeads
	@RequestMapping("/allLeads")
	public String getAllLeads(Model model) {
		List<Lead> leads = leadService.getAllLeads();
		model.addAttribute("leads", leads);
		return"AllLeadRecords";
		
	}
	
	@RequestMapping("/change")
	public String changeLead(@RequestParam("id")Long id,Model model) {
		Lead findByLeadId = leadService.findByLeadId(id);
		model.addAttribute("lead", findByLeadId);
		return "ShowLeads";
	}
	@RequestMapping("/deleteRecord")
	public String deleteLead(@RequestParam("id")Long id,Model model) {
		leadService.deleteLeadId(id);
		List<Lead> leads = leadService.getAllLeads();
		model.addAttribute("leads", leads);
		return"AllLeadRecords";
	}
	@RequestMapping("/updateRecord")
	public String findLead(@RequestParam("id")Long id,Model model) {
		Lead findByLeadId = leadService.findByLeadId(id);
		model.addAttribute("findByLeadId",findByLeadId);
		return "UpdateLead";
	}
	@RequestMapping("/updateLead")
	public String updateLead(@ModelAttribute("lead")Lead lead,Model model) {
		leadService.saveLeadRecord(lead);
		List<Lead> leads = leadService.getAllLeads();
		model.addAttribute("leads", leads);
		return"AllLeadRecords";
	}

}
