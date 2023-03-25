package com.zohocrmProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrmProject.entity.Contact;
import com.zohocrmProject.services.ContactService;

@Controller
public class ContactController {
	
	@Autowired
	private ContactService contactService;
	
	//http://localhost:8081/allContact
	
	@GetMapping("/allContact")
	public String getAllContact(Model model) {
		List<Contact> contacts = contactService.getContacts();
		model.addAttribute("contacts",contacts);
		return "AllContacts";
	}
	
	@RequestMapping("/delete")
	public String deleteContact(@RequestParam("id")Long id,Model model) {
		contactService.deleteByContactId(id);
		List<Contact> contacts = contactService.getContacts();
		model.addAttribute("contacts",contacts);
		return "AllContacts";
	}
	
	@RequestMapping("/update")
	public String FindUpdateContact(@RequestParam("id")Long id,Model model) {
		Contact contact=contactService.findByContact(id);
		model.addAttribute("contact", contact);
		return "UpdateContact";
	}
	
	@RequestMapping("/updateRecords")
	public String updateContact(@ModelAttribute("contact") Contact contact,Model model) {
		contactService.saveContact(contact);
		List<Contact> contacts = contactService.getContacts();
		model.addAttribute("contacts",contacts);
		return "AllContacts";
	}
}
