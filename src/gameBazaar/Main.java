package gameBazaar;

import java.sql.Date;

import gameBazaar.Adapter.MernisVerifyAdapter;
import gameBazaar.Concrete.AuthManager;
import gameBazaar.Concrete.CampaignManager;
import gameBazaar.Concrete.GameManager;
import gameBazaar.Concrete.SaleManager;
import gameBazaar.Concrete.UserManager;
import gameBazaar.Concrete.UserVerifyManager;
import gameBazaar.Entities.Campaign;
import gameBazaar.Entities.Game;
import gameBazaar.Entities.User;

public class Main {

	public static void main(String[] args) {		
		GameManager gameManager=new GameManager();
		CampaignManager campaignManager=new CampaignManager();
		AuthManager authManager=new AuthManager(new MernisVerifyAdapter(),new UserManager());
		User berket=new User("123456789", "Berket Göktürk", "Yanýk", 2003);
		
		Game minecraft=new Game("Minecraft",140);
		Game forHonor=new Game("For Honor",100);
		gameManager.add(forHonor);
		gameManager.add(minecraft);
		System.out.println("-------------");
		System.out.println("Oyun Listesi - Pazar Alaný");
		Game[] games= new Game[]{minecraft,forHonor};
		gameManager.getAll(games);
		System.out.println("-------------");
		
		Campaign campaign1=new Campaign("Bahar indirimi", 15);
		Campaign campaign2=new Campaign("Yeni kullanýcý hoþ geldin bro be indirimi", 20);
		
		campaignManager.add(campaign1);		
		campaignManager.add(campaign2);	
		System.out.println("Kampanyalar");
		Campaign[] campaigns=new Campaign[] {campaign1,campaign2};
		campaignManager.getAll(campaigns);
		System.out.println("-------------");
		authManager.register(berket);		
		authManager.login(berket);
		System.out.println("-------------");
		
		
		
		
		SaleManager saleManager=new SaleManager(new MernisVerifyAdapter());
		saleManager.sell(berket, forHonor, campaign2);
		
		System.out.println("Teþekkürler");
	}

}
