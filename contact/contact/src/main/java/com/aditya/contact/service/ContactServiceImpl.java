package com.aditya.contact.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.aditya.contact.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService {
	
	List<Contact> contacts = List.of(
			new Contact(1432L, "rohits@gmail.com", "Rohit", 1311L),
			new Contact(1433L, "sahil@gmail.com", "Sahil", 1311L),
			new Contact(1434L, "anubhav@gmail.com", "Anubhav", 1314L),
			new Contact(1435L, "rajeev@gmail.com", "Rajeev", 1311L),
			new Contact(1436L, "rahul@gmail.com", "Rahul", 1313L),
			new Contact(1437L, "ankit@gmail.com", "Ankit", 1312L),
			new Contact(1438L, "aniket@gmail.com", "Aniket", 1314L)
			);

	@Override
	public List<Contact> getContactsOfUser(Long userId) {
		return contacts.stream().filter(x->x.getUserId().equals(userId)).collect(Collectors.toList());
	}

}
