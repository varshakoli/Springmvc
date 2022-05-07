package MySpringMVC.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import MySpringMVC.dao.UserDao;
import MySpringMVC.model.User;

import MySpringMVC.services.UserService;

@Repository
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;
	@Override
	public int Service_create(User user) {
		return userDao.create(user);
		
		
	}

	

}
