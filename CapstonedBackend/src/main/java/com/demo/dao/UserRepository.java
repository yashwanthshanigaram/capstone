package com.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	public User findByName(String name);
	public User findByPwd(String pwd);
	public User findByEmailid(String emailid);
	public User findByEmailidAndPwd(String emailid,String pwd);

}
