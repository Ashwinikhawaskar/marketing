package com.wallet.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wallet.entities.UserDetails;
import com.wallet.entities.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	@Override
	public void saveUser(UserDetails userDetail) {
		userRepository.save(userDetail);
	}

}
