package gameBazaar.Concrete;

import gameBazaar.Abstract.AutService;
import gameBazaar.Abstract.UserService;
import gameBazaar.Abstract.UserVerifyService;

import gameBazaar.Entities.User;

public class AuthManager implements AutService {

	private UserVerifyService userVerifyService;
	private UserService userService;

	public AuthManager(UserVerifyService userVerifyService, UserService userService) {
		this.userVerifyService = userVerifyService;
		this.userService = userService;
	}

	@Override
	public void login(User user) {
		System.out.println(user.getFirstName() + ": iþleminiz kontrol ediliyor.");
		if (userVerifyService.verifyUser(user)) {
			System.out.println("Kimliniz doðrulandý! baþarýlý bir þekilde giriþ yaptýnýz");
		} else {
			System.out.println("Kimlik doðrulama iþleminiz baþarýz olmuþtur.");
		}
	}

	@Override
	public void register(User user) {
		if (userVerifyService.verifyUser(user)) {
			userService.add(user);
		} else {
			System.out.println("Kimlik doðrulama iþleminiz baþarýsýz olmuþtur. Lütfen bilgilerinizi kontrol ediniz.");
		}
	}

}
