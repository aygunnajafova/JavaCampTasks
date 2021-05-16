package gameDemo.business.abstracts;

import gameDemo.entities.concretes.Gamer;

public interface GamerCheckService {

	boolean checkIfRealGamer(Gamer gamer);

}
