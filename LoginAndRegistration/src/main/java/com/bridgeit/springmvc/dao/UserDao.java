package com.bridgeit.springmvc.dao;

import com.bridgeit.springmvc.dto.Login;
import com.bridgeit.springmvc.dto.UserDto;
import com.bridgeit.springmvc.model.User;

public interface UserDao {

	void register(User user);

	User validateUser(Login login);
}
