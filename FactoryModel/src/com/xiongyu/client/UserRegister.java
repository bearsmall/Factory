package com.xiongyu.client;

import org.junit.Test;

import com.xiongyu.dao.UserDao;
import com.xiongyu.dao.factory.UserDaoFactory;
import com.xiongyu.model.User;

public class UserRegister {
	private User user = new User("xiongyu", "123456");

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * Client层的login方法调用dao层的save方法 具体由dao层实现
	 */
	@Test
	public void login() {
		//1.直接new一个UserDao
		// UserDao userDao = new MemoryUserDao();
		
		//2.使用工厂模式创建Dao对象
		UserDao userDao = UserDaoFactory.createUserDao();
		
		userDao.save(user);
	}
}
