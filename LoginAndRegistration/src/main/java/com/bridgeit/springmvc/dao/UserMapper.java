package com.bridgeit.springmvc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.bridgeit.springmvc.model.User;

public class UserMapper  implements RowMapper {

	@Override
	public User mapRow(ResultSet rs, int arg1) throws SQLException {
		User user = new User();
	    user.setUsername(rs.getString("username"));
	    user.setPassword(rs.getString("password"));
	    user.setFirstname(rs.getString("firstname"));
	    user.setLastname(rs.getString("lastname"));
	    user.setEmail(rs.getString("email"));
	    user.setAddress(rs.getString("address"));
	    user.setPhone(rs.getString("phone"));
	    user.setRegDate(rs.getString("regDate"));
	    return user;
	} 

}
