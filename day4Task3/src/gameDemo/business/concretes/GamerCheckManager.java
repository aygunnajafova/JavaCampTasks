package gameDemo.business.concretes;


import gameDemo.business.abstracts.GamerCheckService;
import gameDemo.entities.concretes.Gamer;

public class GamerCheckManager implements GamerCheckService {

	@Override
	public boolean checkIfRealGamer(Gamer gamer) {
		return true;
	}


}
