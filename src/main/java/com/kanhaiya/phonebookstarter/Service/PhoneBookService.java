package com.kanhaiya.phonebookstarter.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Service;

import com.kanhaiya.phonebookstarter.Entity.PhoneBook;
import com.kanhaiya.phonebookstarter.Repository.PhoneBookRepository;


@Service
@EnableAutoConfiguration
public class PhoneBookService {

	@Autowired
	private PhoneBookRepository phoneBookRepository;
	
	private List<PhoneBook> records = new ArrayList<>(Arrays.asList(
					new PhoneBook("sachin","6823745298"),
					new PhoneBook("virat","+123355456"),
					new PhoneBook("rohit","+9892383432")
					)
			);
	
	
	public List<PhoneBook> getAllRecords(){
		//return records;
		List<PhoneBook> records =  new ArrayList<>();
		phoneBookRepository.findAll().forEach(records::add);		
		return records;
	}
	
	public PhoneBook getByName(String name) {
		for(int i = 0 ; i < records.size() ; i++) {
			if(records.get(i).getName().equals(name)) {
				return records.get(i);
			}
		}
		return null;
	}

	public void addRecord(PhoneBook phoneBook) {
	//	records.add(phoneBook);
		phoneBookRepository.save(phoneBook);
	}

	public void deleteByName(String name) {
		for(int i = 0 ; i < records.size(); i++) {
			PhoneBook pb = records.get(i);
			if(pb.getName().equals(name)) {
				records.remove(i);
			}
		}
	}

	public void deleteByNumber(String number) {
		
		records.removeIf(pb-> pb.getPhoneNumber().equals(number));
		
	}	
	
	public int getSize() {
		return records.size();
	}

	
	
}
