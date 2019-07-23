package com.bridgeit.springmvc.service;

import com.bridgeit.springmvc.dto.Login;
import com.bridgeit.springmvc.dto.UserDto;
import com.bridgeit.springmvc.model.User;

public interface IService {
	
public void register(UserDto userDto);

public User validateUser(Login login);

}
