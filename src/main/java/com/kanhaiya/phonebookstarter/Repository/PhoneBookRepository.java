package com.kanhaiya.phonebookstarter.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kanhaiya.phonebookstarter.Entity.PhoneBook;
@Repository
public interface PhoneBookRepository extends CrudRepository<PhoneBook,String> {

}
