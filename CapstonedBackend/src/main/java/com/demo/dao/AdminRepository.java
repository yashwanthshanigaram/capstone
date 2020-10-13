package com.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {
	Admin findByName(String name);
	Admin findByPwd(String pwd);
	Admin findByNameAndPwd(String name, String pwd);

}
