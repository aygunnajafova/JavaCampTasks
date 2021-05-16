package gameDemo.business.abstracts;

import gameDemo.entities.concretes.Campaign;

public interface CampaignService {
	
	void save(Campaign campaign);

	void update(Campaign campaign);

	void delete(Campaign campaign);
}
