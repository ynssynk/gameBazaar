package gameBazaar.Abstract;

import gameBazaar.Entities.Game;

public interface GameService {
	void getAll(Game[] games);
	void add(Game game);
	void update(Game game);
	void delete(Game game);
}
