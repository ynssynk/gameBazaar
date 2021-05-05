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
		System.out.println(user.getFirstName() + ": i�leminiz kontrol ediliyor.");
		if (userVerifyService.verifyUser(user)) {
			System.out.println("Kimliniz do�ruland�! ba�ar�l� bir �ekilde giri� yapt�n�z");
		} else {
			System.out.println("Kimlik do�rulama i�leminiz ba�ar�z olmu�tur.");
		}
	}

	@Override
	public void register(User user) {
		if (userVerifyService.verifyUser(user)) {
			userService.add(user);
		} else {
			System.out.println("Kimlik do�rulama i�leminiz ba�ar�s�z olmu�tur. L�tfen bilgilerinizi kontrol ediniz.");
		}
	}

}
