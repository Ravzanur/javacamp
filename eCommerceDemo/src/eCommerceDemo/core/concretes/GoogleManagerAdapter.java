package eCommerceDemo.core.concretes;

import eCommerceDemo.core.abstracts.LoginService;
import eCommerceDemo.google.GoogleManager;

public class GoogleManagerAdapter implements LoginService {

	@Override
	public void loginToSystem(String message) {
		GoogleManager manager = new GoogleManager();
		manager.register(message);
	}

}
