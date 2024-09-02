package com.api.dao;

import java.sql.Date;
import java.util.List;

import com.api.entity.User;
import com.api.security.CustomUserDetail;

public interface UserDao {
	public CustomUserDetail loadUserByUserId(String userId);

	User loginUser(User user);

	
}
