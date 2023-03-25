package com.zohocrmProject.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrmProject.entity.Contact;
import com.zohocrmProject.repository.ContactRepository;

@Service
public class ContactServiceImp implements ContactService {
	
	@Autowired
	private ContactRepository contactRepository;

	@Override
	public void saveContact(Contact contact) {
		contactRepository.save(contact);
	}

	@Override
	public List<Contact> getContacts() {
		List<Contact> findAll = contactRepository.findAll();
		return findAll;
	}

	@Override
	public void deleteByContactId(Long id) {
		contactRepository.deleteById(id);
	}

	@Override
	public Contact findByContact(Long id) {
		Optional<Contact> findById = contactRepository.findById(id);
		Contact contact = findById.get();
		return contact;
	}


}
