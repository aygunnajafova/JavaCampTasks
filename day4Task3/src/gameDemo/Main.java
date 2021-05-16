package gameDemo;

import gameDemo.adapters.EGovernmentSystemAdapter;
import gameDemo.business.abstracts.BaseGamerManager;
import gameDemo.business.concretes.GameSaleManager;
import gameDemo.business.concretes.GamerManager;
import gameDemo.entities.concretes.Campaign;
import gameDemo.entities.concretes.Gamer;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Gamer gamer = new Gamer(1, "Aygun", "Najafova", LocalDate.of(2002, 01, 15), "0123456789");
		Campaign campaign = new Campaign(1, "FirstCampaign");

		BaseGamerManager gamerManager = new GamerManager(new EGovernmentSystemAdapter());
		gamerManager.save(gamer);

		GameSaleManager gameSaleManager = new GameSaleManager();
		gameSaleManager.Sale(gamer, campaign);
	}
}
