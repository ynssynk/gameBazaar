package gameBazaar.Concrete;

import gameBazaar.Abstract.SaleService;
import gameBazaar.Abstract.UserVerifyService;
import gameBazaar.Entities.Campaign;
import gameBazaar.Entities.Game;
import gameBazaar.Entities.User;

public class SaleManager implements SaleService{

	private UserVerifyService userVerifyService;
	
	public SaleManager(UserVerifyService userVerifyService) {
		this.userVerifyService = userVerifyService;
	}
	@Override
	public void sell(User user, Game game, Campaign campaign) {
		double price=0;
		
		if(userVerifyService.verifyUser(user)==true)
		{
			System.out.println("Oyun ad�: "+game.getName() +" Fiyat�: "+game.getPrice());
			price=calculatePrice(campaign, game.getPrice());
			System.out.println(game.getName()+" adl� oyunu.=>"+campaign.getName()+" adl� kampanya dahilinde =>" +price+" fiyat�ndan sat�n al�nm��t�r.");
		}else {
			System.out.println("Kimlik do�rulama i�leminiz ba�ar�s�z olmu�tur l�tfen bilgileriniiz kontrol ediniz.");
		}
	}
	private double calculatePrice(Campaign campaign, double price) {
		double gamePrice=price-(price*campaign.getDiscount()/100);
		return gamePrice;
	}

}
