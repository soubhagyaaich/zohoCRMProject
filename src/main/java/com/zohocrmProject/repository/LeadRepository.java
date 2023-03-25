package com.zohocrmProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrmProject.entity.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {

}
