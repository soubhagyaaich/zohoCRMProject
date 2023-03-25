package com.zohocrmProject.services;

import java.util.List;

import com.zohocrmProject.entity.Lead;

public interface LeadService {

	public void saveLeadRecord(Lead lead);

	public Lead findByLeadId(Long id);

	public void deleteLeadId(Long id);

	public List<Lead> getAllLeads();
}
