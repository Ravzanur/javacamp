package eCommerceDemo.business.concretes;

import eCommerceDemo.business.abstracts.AuthService;
import eCommerceDemo.business.abstracts.UserService;
import eCommerceDemo.business.abstracts.ValidityService;
import eCommerceDemo.dataAccess.abstracts.UserDao;
import eCommerceDemo.entities.concretes.User;

public class UserManager implements UserService{
	
	UserDao userDao;
	AuthService authService;
	ValidityService validityService;
	
	public UserManager(UserDao userDao, AuthService authService, ValidityService validityService) {
		this.userDao = userDao;
		this.authService = authService;
		this.validityService = validityService;
	}

	@Override
	public void register(User user) {
		if(validityService.isUsed(user.getEmail())&&
				authService.firstNameCheck(user.getFirstName())&&
				authService.lastNameCheck(user.getLastName())&&
				authService.emailCheck(user.getEmail())&&
				authService.passwordCheck(user.getPassword())) {
			userDao.register(user);
			System.out.println(user.getEmail() + " mailine do�rulama e-postas� g�nderildi. L�tfen do�rulama i�lemini yap�n�z.");
			System.out.println("Do�rulama yap�ld�.Sisteme kayd�n�z al�nd�.");
		}
		
	}

	@Override
	public void signIn(String email, String password) {
		for(int i =0; i<userDao.getList().size(); i++) {
			if(userDao.getList().get(i).getEmail().equals(email)&&
					userDao.getList().get(i).getPassword().equals(password)) {
				System.out.println("**G�R�� BA�ARILI**");
				return;
			}   
		}
		System.out.println("Giri� ba�ar�s�z.Eposta veya �ifrenizi kontro ediniz.");
	}
}

