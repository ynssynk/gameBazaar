package gameBazaar.Concrete;

import gameBazaar.Abstract.GameService;
import gameBazaar.Entities.Game;

public class GameManager implements GameService{

	@Override
	public void getAll(Game[] games) {		
		for (Game game : games) {
			System.out.println("Oyun ad�: "+game.getName()+"Fiyat: "+game.getPrice());
		}
	}

	@Override
	public void add(Game game) {
		System.out.println(game.getName()+ " : adl� oyun ma�azaya eklendi");
		
	}

	@Override
	public void update(Game game) {
		
		System.out.println(game.getName()+" : adl� oyunun bilgileri g�ncellendi");
	}

	@Override
	public void delete(Game game) {
		
		System.out.println(game.getName()+": adl� oyun ma�azadan kald�r�lm��t�r.");
	}
	
}
