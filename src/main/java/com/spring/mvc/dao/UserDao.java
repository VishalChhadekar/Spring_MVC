package com.spring.mvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.mvc.entity.User;

@Repository
public class UserDao {
	@Autowired
	private HibernateTemplate ht;

	@Transactional
	public int saveUser(User user) {
		return (Integer) ht.save(user);
	}

}
