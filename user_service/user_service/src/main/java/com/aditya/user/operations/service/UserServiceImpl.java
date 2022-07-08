package com.aditya.user.operations.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.aditya.user.operations.entity.User;

@Service
public class UserServiceImpl implements UserService {
	
	List<User> list = List.of(
			new User(1311L, "Aditya", "1234565435"),
			new User(1312L, "Sahil", "9876545622"),
			new User(1313L, "Anubhav", "6787654728"),
			new User(1314L, "Rizwan", "9876545673")
			);

	@Override
	public User getUser(Long userId) {
		return list.stream().filter(x->x.getUserId().equals(userId)).findAny().orElse(null);
	}

}
