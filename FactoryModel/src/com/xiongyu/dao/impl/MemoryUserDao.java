package com.xiongyu.dao.impl;

import java.util.HashMap;
import java.util.Map;

import com.xiongyu.dao.UserDao;
import com.xiongyu.model.User;

public class MemoryUserDao implements UserDao {

	private static Map users = new HashMap();

	static {
		User user = new User("Moxie", "pass");
		users.put(user.getUsername(), user);
	}

	@Override
	public void save(User user) {
		users.put(user.getUsername(), user);
	}

	@Override
	public User load(String name) {
		return (User) users.get(name);
	}

}
