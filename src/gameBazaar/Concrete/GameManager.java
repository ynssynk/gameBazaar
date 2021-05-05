package gameBazaar.Concrete;

import gameBazaar.Abstract.GameService;
import gameBazaar.Entities.Game;

public class GameManager implements GameService{

	@Override
	public void getAll(Game[] games) {		
		for (Game game : games) {
			System.out.println("Oyun adý: "+game.getName()+"Fiyat: "+game.getPrice());
		}
	}

	@Override
	public void add(Game game) {
		System.out.println(game.getName()+ " : adlý oyun maðazaya eklendi");
		
	}

	@Override
	public void update(Game game) {
		
		System.out.println(game.getName()+" : adlý oyunun bilgileri güncellendi");
	}

	@Override
	public void delete(Game game) {
		
		System.out.println(game.getName()+": adlý oyun maðazadan kaldýrýlmýþtýr.");
	}
	
}
