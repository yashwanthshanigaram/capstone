package com.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.UserRepository;
import com.demo.model.User;
import com.demo.service.UserService;
import com.demo.dao.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository dao;

	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		return dao.save(user);
	}

	@Override
	public User addUserLogin(User user) {
		// TODO Auto-generated method stub
		return dao.save(user);
		
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserByName(String name) {
		// TODO Auto-generated method stub
		return dao.findByName(name);
	}

	@Override
	public User getUserByPwd(String pwd) {
		// TODO Auto-generated method stub
		return dao.findByPwd(pwd);
	}
	

	@Override
	public User getUserByEmail(String emailid) {
		// TODO Auto-generated method stub
		return dao.findByEmailid(emailid);
	}

	@Override
	public User getUserByEmailidAndPwd(String emailid, String pwd) {
		// TODO Auto-generated method stub
		return dao.findByEmailidAndPwd(emailid, pwd);
	}

}
