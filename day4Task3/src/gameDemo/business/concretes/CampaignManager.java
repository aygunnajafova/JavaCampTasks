package gameDemo.business.concretes;

import gameDemo.business.abstracts.CampaignService;
import gameDemo.entities.concretes.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void save(Campaign campaign) {
		System.out.println(campaign.getName() + " campaign is added");

	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getName() + " campaign is updated");

	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName() + " campaign is deleted");

	}

}
