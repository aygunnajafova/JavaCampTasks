package gameDemo.business.abstracts;

import gameDemo.entities.concretes.Gamer;

public abstract class BaseGamerManager implements GamerService {

	@Override
	public void save(Gamer gamer) {
		System.out.println("Saved to campaign : " + gamer.getFirstName());
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Updated in db : " + gamer.getFirstName());

	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Deleted from db : " + gamer.getFirstName());

	}

}
