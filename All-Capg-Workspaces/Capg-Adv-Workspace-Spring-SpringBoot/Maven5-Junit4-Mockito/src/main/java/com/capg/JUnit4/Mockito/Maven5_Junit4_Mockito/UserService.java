package com.capg.JUnit4.Mockito.Maven5_Junit4_Mockito;

public class UserService {
	private UserDAO userDao;

	public UserService(UserDAO userDao) {
		this.userDao = userDao;
	}
	public String getUserName(int id) {
		return userDao.findUsernamebyId(id);
	}
}
