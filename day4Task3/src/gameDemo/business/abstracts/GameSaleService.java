package gameDemo.business.abstracts;

import gameDemo.entities.concretes.Campaign;
import gameDemo.entities.concretes.Gamer;

public interface GameSaleService {
	void Sale(Gamer gamer, Campaign campaign);

}
