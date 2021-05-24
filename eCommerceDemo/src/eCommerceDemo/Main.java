package eCommerceDemo;

import eCommerceDemo.business.abstracts.UserService;
import eCommerceDemo.business.concretes.AuthManager;
import eCommerceDemo.business.concretes.UserManager;
import eCommerceDemo.business.concretes.ValidityManager;
import eCommerceDemo.dataAccess.concretes.HibernateUserDao;
import eCommerceDemo.entities.concretes.User;


public class Main {


	public static void main(String[] args) {
		
		HibernateUserDao hibernateUserDao = new HibernateUserDao();
		
		User user1 = new User(1, "Ravzanur", "Cantürk", "ravza@gmail.com", "1234abc");
		User user2 = new User(2, "Ayse", "Can", "ayse@gmail.com", "56789aa");
		User user3 = new User(2, "Ali", "Yaz", "ali@gmail.com", "5678hjh");
		
		UserService userManager = new UserManager(hibernateUserDao, new AuthManager(), new ValidityManager(hibernateUserDao));
		userManager.register(user1);
		userManager.register(user2);
		userManager.register(user3);
		
		userManager.signIn(hibernateUserDao.getAll(),"ravza@gmail.com","56");//hatalý giriþ
		userManager.signIn(hibernateUserDao.getAll(),"ravza@gmail.com","1234abc");
		
		
	}

}
