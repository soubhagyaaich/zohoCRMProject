package com.zohocrmProject.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrmProject.entity.Billing;
import com.zohocrmProject.repository.BillingRepository;


@Service
public class BillingServiceImp implements BillingService {

	@Autowired
	private BillingRepository billingRepository;
	
	@Override
	public void saveBilling(Billing billing) {
		billingRepository.save(billing);
		
	}


}
