package com.xiongyu.dao;

import com.xiongyu.model.User;

public interface UserDao {
	public void save(User user);
	
	public User load(String name);
}
