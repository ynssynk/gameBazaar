package gameBazaar.Concrete;


import gameBazaar.Abstract.UserVerifyService;
import gameBazaar.Entities.User;

public class UserVerifyManager implements UserVerifyService{

	@Override
	public boolean verifyUser(User user) {		
		return true;
	}

}
