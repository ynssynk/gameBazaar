package gameBazaar.Abstract;

import gameBazaar.Entities.Campaign;
import gameBazaar.Entities.User;
import gameBazaar.Entities.Game;


public interface SaleService {
	void sell(User user,Game game,Campaign campaign);
}
