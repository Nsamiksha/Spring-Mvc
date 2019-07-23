package com.bridgeit.springmvc.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;

import com.bridgeit.springmvc.dao.UserDao;
import com.bridgeit.springmvc.dto.Login;
import com.bridgeit.springmvc.dto.UserDto;
import com.bridgeit.springmvc.model.User;

public class ServiceImpl implements IService {
	
	@Autowired
	private UserDao dao;

	@Override
	public void register(UserDto userDto) {
		System.out.println(userDto);

		LocalDateTime myDateObj = LocalDateTime.now();
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

		String formattedDate = myDateObj.format(myFormatObj);
		User user = new User();
		user.setUsername(userDto.getUsername());
		user.setPassword(userDto.getPassword());
		user.setFirstname(userDto.getFirstname());
		user.setLastname(userDto.getLastname());
		user.setEmail(userDto.getEmail());
		user.setAddress(userDto.getAddress());
		user.setPhone(userDto.getPhone());
		user.setRegDate(formattedDate);
		dao.register(user);
		
	}

	@Override
	public User validateUser(Login login) {
		User user = dao.validateUser(login);
		return user;
	}

}
