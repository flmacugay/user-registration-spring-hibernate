package com.mac.registration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mac.registration.entity.User;
import com.mac.registration.repository.UserRepository;

@Service
@Transactional
public class RegistrationServiceImpl implements RegistrationService {

	@Autowired
	private UserRepository userRepository;

	public User getUser(int userId) {
		return userRepository.findOne(userId);
	}

	public void addUser(User user) {
		userRepository.save(user);
	}

	public void updateUser(User user) {
		userRepository.save(user);

	}

	public void removeUser(int userId) {
		userRepository.delete(userId);
	}

	public List<User> listUsers() {
		return userRepository.findAll();
	}

}
