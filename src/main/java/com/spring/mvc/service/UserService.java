package com.spring.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.mvc.dao.UserDao;
import com.spring.mvc.entity.User;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;

	public int creatUser(User user) {
		return userDao.saveUser(user);
	}

}
