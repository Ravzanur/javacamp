package eCommerceDemo.business.abstracts;

public interface AuthService {
	
	boolean firstNameCheck(String firstName);
	boolean lastNameCheck(String lastName);
	boolean emailCheck(String email);
	boolean passwordCheck(String password);
}
