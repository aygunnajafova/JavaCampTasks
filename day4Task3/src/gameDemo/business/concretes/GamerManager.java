package gameDemo.business.concretes;

import gameDemo.business.abstracts.BaseGamerManager;
import gameDemo.business.abstracts.GamerCheckService;
import gameDemo.business.abstracts.GamerService;
import gameDemo.entities.concretes.Gamer;

public class GamerManager extends BaseGamerManager {

	private GamerCheckService gamerCheckService;
	public GamerManager(GamerCheckService gamerCheckService) {
		this.gamerCheckService = gamerCheckService;
	}

	public void save(Gamer gamer) {
		if (gamerCheckService.checkIfRealGamer(gamer)) {
			super.save(gamer);
		} else {
			System.out.println("Not a valid gamer!");
		}

	}

	public void update(Gamer gamer) {
		super.update(gamer);

	}

	public void delete(Gamer gamer) {
		super.delete(gamer);

	}

}
