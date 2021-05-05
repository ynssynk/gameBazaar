package gameBazaar.Abstract;

import gameBazaar.Entities.Campaign;

public interface CampaignService {
	void getAll(Campaign[] campaigns);
	void add(Campaign campaign);
	void update(Campaign campaign);
	void delete(Campaign campaign);
}
