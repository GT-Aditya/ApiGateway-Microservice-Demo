package com.aditya.contact.service;

import java.util.List;

import com.aditya.contact.entity.Contact;

public interface ContactService {

	public List<Contact> getContactsOfUser(Long userId);
}
