package com.kanhaiya.phonebookstarter.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kanhaiya.phonebookstarter.Entity.PhoneBook;
import com.kanhaiya.phonebookstarter.Service.PhoneBookService;

@RestController
public class PhoneBookController {

	@Autowired
	private PhoneBookService phoneBookService;
	
	
	@RequestMapping("/PhoneBook")
	public List<PhoneBook> getAllRecords() {
		return phoneBookService.getAllRecords();
	}
	
	
	@RequestMapping("/PhoneBook/list")
	public List<PhoneBook> getPhoneBook(){
		return phoneBookService.getAllRecords();
	}
	
	@RequestMapping("/PhoneBook/size")
	public int getSize() {
		return phoneBookService.getSize();
	}
	
	@RequestMapping("/PhoneBook/{name}")
	public PhoneBook getRecordByName(@PathVariable String name) {
		return phoneBookService.getByName(name);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/PhoneBook/add")
	public void addRecord(@RequestBody PhoneBook phoneBook) {
		phoneBookService.addRecord(phoneBook);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/PhoneBook/deleteByName")
	public void deleteRecordByName(@RequestBody String name) {
		phoneBookService.deleteByName(name);
	}
	
	
	@RequestMapping(method=RequestMethod.PUT, value="PhoneBook/deleteByNumber")
	public void deleteRecordByNumber(@RequestBody String number) {
		phoneBookService.deleteByNumber(number);
	}
	
	
	
}
