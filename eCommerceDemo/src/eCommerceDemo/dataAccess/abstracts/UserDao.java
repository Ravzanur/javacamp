package eCommerceDemo.dataAccess.abstracts;

import java.util.List;

import eCommerceDemo.entities.concretes.User;

public interface UserDao {
	public void register(User user);
	public void logIn(User user);
	List<User> getList();
}
