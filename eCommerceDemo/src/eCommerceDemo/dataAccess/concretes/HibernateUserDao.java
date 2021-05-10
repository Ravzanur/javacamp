package eCommerceDemo.dataAccess.concretes;

import java.util.List;

import eCommerceDemo.dataAccess.abstracts.UserDao;
import eCommerceDemo.entities.concretes.User;

public class HibernateUserDao implements UserDao {
	
	private List<User> users;
	
	public HibernateUserDao(List<User> users) {
		super();
		this.users = users;
	}

	@Override
	public void register(User user) {
		this.users.add(user);
		System.out.println("Sisteme kayýt olundu : " + user.getFirstName() +" "+ user.getLastName());
		
	}

	@Override
	public void logIn(User user) {
		System.out.println("Sisteme giriþ yapýldý : " + user.getFirstName() +" "+ user.getLastName());
		
	}

	@Override
	public List<User> getList() {
		return this.users;
	}

}
