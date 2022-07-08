package com.aditya.user.operations.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.aditya.user.operations.entity.User;
import com.aditya.user.operations.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService service;
	
	@Autowired
	private RestTemplate template;
	
	@GetMapping("/{userId}")
	public User getUser(@PathVariable Long userId) {
		User user = service.getUser(userId);
		 List contacts = template.getForObject("http://contact-service/contacts/user/"+userId, List.class);
		user.setContacts(contacts);
		return user;
	}
}
