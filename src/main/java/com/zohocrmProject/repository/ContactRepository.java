package com.zohocrmProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrmProject.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}
