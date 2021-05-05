package gameBazaar.Concrete;

import gameBazaar.Abstract.UserService;
import gameBazaar.Entities.User;

public class UserManager implements UserService{

	@Override
	public void add(User user) {		
		System.out.println("Tebrikler ba�ar�l� bir �ekilde kay�t oldunuz : :"+user.getFirstName());
	}

	@Override
	public void update(User user) {
		System.out.println("Tebrikler ba�ar�l� bir �ekilde g�ncllediniz:"+user.getFirstName());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Bilgiler :"+user.getFirstName());
		
	}

}
