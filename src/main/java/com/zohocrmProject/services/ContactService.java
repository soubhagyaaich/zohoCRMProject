package com.zohocrmProject.services;

import java.util.List;

import com.zohocrmProject.entity.Contact;

public interface ContactService {

	void saveContact(Contact contact);

	List<Contact> getContacts();

	void deleteByContactId(Long id);

	Contact findByContact(Long id);


}
