package eCommerceDemo.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eCommerceDemo.business.abstracts.AuthService;

public class AuthManager implements AuthService{
	
	public AuthManager() {
		
	}

	@Override
	public boolean firstNameCheck(String firstName) {
		if(firstName.length()<2) {
			System.out.println("Geçersiz isim!!");
			return false;
		}
		return true;
	}

	@Override
	public boolean lastNameCheck(String lastName) {
		if(lastName.length()<2) {
			System.out.println("Geçersiz soyisim!!");
			return false;
		}
		return true;
	}

	@Override
	public boolean emailCheck(String email) {
		String regex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if(!matcher.matches()) {
        	System.out.println("Geçersiz email!!");
        	return false;
        }
        return true;
	}

	@Override
	public boolean passwordCheck(String password) {
		if(password.length()<6) {
			System.out.println("Geçersiz þifre!!");
			return false;
		}
		return true;
	}

	 
}
