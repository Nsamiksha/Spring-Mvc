package com.bridgeit.springmvc.dao;


import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.bridgeit.springmvc.dto.Login;
import com.bridgeit.springmvc.model.User;

public class UserDaoImpl implements UserDao {

	private JdbcTemplate jdbcTemplate;

	public UserDaoImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public User validateUser(Login login) {

		String sql = "select * from users where username='" + login.getUsername() + "' and password='" + login.getPassword()
	    + "'";
	    List<User> users = jdbcTemplate.query(sql, new UserMapper());
	    return users.size() > 0 ? users.get(0) : null;
	}

	@Override
	public void register(User user) {
		System.out.println(user);
		String sql = "INSERT INTO users (username, password, firstname, lastname,email,address,phone,regDate)"
				+ " VALUES (?, ?, ?, ?, ? ,? ,? ,? )";
		jdbcTemplate.update(sql, new Object[] { user.getUsername(), user.getPassword(), user.getFirstname(),
				user.getLastname(), user.getEmail(), user.getAddress(), user.getPhone(), user.getRegDate() });

	}
	  
		  }

		


