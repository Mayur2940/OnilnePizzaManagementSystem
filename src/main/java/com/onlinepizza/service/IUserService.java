package com.onlinepizza.service;

import com.onlinepizza.dto.UserDTO;
import com.onlinepizza.entity.User;

public interface IUserService {

	UserDTO registerUser(User user);

	UserDTO signIn(String userName, String password);

	// use session management accordingly
	public String signOut();
}
