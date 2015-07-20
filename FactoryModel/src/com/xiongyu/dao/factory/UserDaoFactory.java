package com.xiongyu.dao.factory;

import com.xiongyu.dao.UserDao;

public class UserDaoFactory {

	public static UserDao createUserDao() {
		String className = "com.xiongyu.dao.impl.MemoryUserDao";// 可以放到配置文件中去
		UserDao userDao = null;
		try {
			userDao = (UserDao) Class.forName(className).newInstance();// 利用反射技术实现对象的创建
		} catch (Exception e) {
			e.printStackTrace();
		}
		return userDao;
	}
}