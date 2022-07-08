package com.aditya.contact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aditya.contact.entity.Contact;
import com.aditya.contact.service.ContactService;

@RestController
@RequestMapping("/contacts")
public class ContactController {
	
	@Autowired
	private ContactService service;
	
	@GetMapping("/user/{userId}")
	public List<Contact> getContactsOfUser(@PathVariable Long userId){
		return service.getContactsOfUser(userId);
	}

}
