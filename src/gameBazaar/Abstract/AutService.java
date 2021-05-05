package gameBazaar.Abstract;

import gameBazaar.Entities.User;

public interface AutService {
	void login(User user);
	void register(User user);
}
