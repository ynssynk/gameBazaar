package gameBazaar.Concrete;

import gameBazaar.Abstract.CampaignService;
import gameBazaar.Entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void getAll(Campaign[] campaigns) {
		
		for (Campaign campaign : campaigns) {
			System.out.println("Kampanyad� ad�: "+campaign.getName());
		}
	}

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getName()+" :kampanya eklendi");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getName()+" :kampanya g�ncellendi");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName()+" :kampanya silindi");
		
	}

}
