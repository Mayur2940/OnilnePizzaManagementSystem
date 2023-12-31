package com.onlinepizza.service;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.onlinepizza.dto.UserDTO;
import com.onlinepizza.entity.User;
@EnableJpaRepositories
public interface IUserService {

	UserDTO registerUser(User user);

	UserDTO signIn(String userName, String password);

	// use session management accordingly
	public String signOut();
}
