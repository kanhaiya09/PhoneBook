package com.kanhaiya.phonebookstarter.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class PhoneBook {
	
	private String name;
	
	@Id
	private String phoneNumber;
	
	
	public PhoneBook() {
		super();
	}
	
	
	public PhoneBook(String name, String phoneNumber) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	
}
