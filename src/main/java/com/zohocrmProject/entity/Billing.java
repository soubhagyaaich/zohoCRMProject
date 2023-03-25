package com.zohocrmProject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "billings")
public class Billing {
	
	@Id
	private Long id;
	
	@Column(name = "first_name",nullable = false,length = 30)
	private String firstName;
	
	@Column(name = "last_name",nullable = false,length = 30)
	private String lastName;
	
	@Column(unique = true,nullable = false,length = 30)
	private String email;
	
	@Column(nullable = false,length = 10)
	private Long mobile;
	
	@Column(unique = true,nullable = false,length = 12)
	private Long adharNo;
	
	@Column(name = "at/post",nullable = false,length = 30)
	private String ap;
	
	@Column(nullable = false,length = 30)
	private String district;
	
	@Column(nullable = false,length = 30)
	private String state;
	
	@Column(name = "regist_no",nullable = false,unique = true,length = 12)
	private String regstNo;
	private String source;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	public Long getAdharNo() {
		return adharNo;
	}
	public void setAdharNo(Long adharNo) {
		this.adharNo = adharNo;
	}
	public String getAp() {
		return ap;
	}
	public void setAp(String ap) {
		this.ap = ap;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getRegstNo() {
		return regstNo;
	}
	public void setRegstNo(String regstNo) {
		this.regstNo = regstNo;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}

}