package eCommerceDemo;

import java.util.List;

import eCommerceDemo.business.abstracts.AuthService;
import eCommerceDemo.business.abstracts.ValidityService;
import eCommerceDemo.business.concretes.UserManager;
import eCommerceDemo.dataAccess.abstracts.UserDao;
import eCommerceDemo.dataAccess.concretes.HibernateUserDao;
import eCommerceDemo.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<User> users;
		User user1 = new User(1, "Ravzanur", "Cantürk", "ravza@gmail.com", "1234");
		
		UserManager userManager = new UserManager(new HibernateUserDao(users), new AuthService(), new ValidityService());
		
		userManager.register(user1);
	}

}
