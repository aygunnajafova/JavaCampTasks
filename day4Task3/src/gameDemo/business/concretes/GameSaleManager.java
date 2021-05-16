package gameDemo.business.concretes;

import gameDemo.business.abstracts.GameSaleService;
import gameDemo.entities.concretes.Campaign;
import gameDemo.entities.concretes.Gamer;

public class GameSaleManager implements GameSaleService {

	@Override
	public void Sale(Gamer gamer, Campaign campaign) {
		System.out.println("Gamer : " + gamer.getFirstName() + " buought game from company of " + campaign.getName());
	}

}
