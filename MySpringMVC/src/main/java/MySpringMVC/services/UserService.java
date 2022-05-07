package MySpringMVC.services;

import org.springframework.stereotype.Service;

import MySpringMVC.model.User;


@Service
public interface UserService {
	public int Service_create(User user);

}
