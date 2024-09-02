package com.api.service;

import org.springframework.transaction.annotation.Transactional;

import com.api.entity.User;
import com.api.security.CustomUserDetail;

@Transactional
public interface UserService {

	CustomUserDetail loadUserByUserId(String userId);

	User loginUser(User user);

}
