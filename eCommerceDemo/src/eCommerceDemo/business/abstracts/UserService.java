package eCommerceDemo.business.abstracts;

import java.util.List;

import eCommerceDemo.entities.concretes.User;

public interface UserService {
	void register(User user);
	void signIn(List<User> users, String mail, String password);
	
}
