package com.zohocrmProject.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrmProject.entity.Lead;
import com.zohocrmProject.repository.LeadRepository;

@Service
public class LeadServiceImp implements LeadService {

	@Autowired
	private LeadRepository leadRepository;
	
	@Override
	public void saveLeadRecord(Lead lead) {
		leadRepository.save(lead);
	}

	@Override
	public Lead findByLeadId(Long id) {
		Optional<Lead> findById = leadRepository.findById(id);
		Lead lead = findById.get();
		return lead;
	}

	@Override
	public void deleteLeadId(Long id) {
		leadRepository.deleteById(id);
	}

	@Override
	public List<Lead> getAllLeads() {
		List<Lead> findAll = leadRepository.findAll();
		return findAll;
	}

}
