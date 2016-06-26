package com.mac.registration.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mac.registration.entity.User;
import com.mac.registration.repository.UserRepository;

@Service
@Transactional
public class LoginServiceImpl implements LoginService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public boolean login(User user) {
		final List<User> loginUser = userRepository
				.findByEmailAndPassword(user.getEmail(), user.getPassword());

		if (loginUser != null && !loginUser.isEmpty()
				&& loginUser.size() > 0) {
			return true;
		}

		return false;
	}

}
