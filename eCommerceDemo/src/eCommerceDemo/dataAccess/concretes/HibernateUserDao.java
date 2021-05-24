package eCommerceDemo.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerceDemo.dataAccess.abstracts.UserDao;
import eCommerceDemo.entities.concretes.User;

public class HibernateUserDao implements UserDao {
	
	public List<User> users = new ArrayList<User>();
	
	
	public HibernateUserDao() {
		
	}

	@Override
	public void register(User user) {
		users.add(user);
		System.out.println("Sisteme kayýt olundu : " + user.getFirstName() +" "+ user.getLastName());
		
	}

	@Override
	public void logIn(User user) {
		System.out.println("Sisteme giriþ yapýldý : " + user.getFirstName() +" "+ user.getLastName());
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return users;
	}

}
