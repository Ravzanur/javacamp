package eCommerceDemo.business.concretes;

import eCommerceDemo.business.abstracts.ValidityService;
import eCommerceDemo.dataAccess.abstracts.UserDao;
import eCommerceDemo.entities.concretes.User;

public class ValidityManager implements ValidityService{
	
	UserDao userDao;
	
	public ValidityManager(UserDao userDao) {	
		this.userDao = userDao;
	}
	
	
	@Override
	public boolean isUsed(String email) {
		for (User user: UserDao.users) {
			if(email.equals(user.getEmail())) {
				System.out.println("Kullanýlmýþ eposta!");
				return false;
			}
		}
		return true;
	}

}
