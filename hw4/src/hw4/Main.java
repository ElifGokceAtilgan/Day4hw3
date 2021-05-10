package hw4;

import java.time.LocalDate;

import hw4.adapters.MernisServiceAdapter;
import hw4.concretes.CampaignManager;
import hw4.concretes.GameManager;
import hw4.concretes.GamerManager;
import hw4.concretes.SaleManager;
import hw4.entities.Campaign;
import hw4.entities.Game;
import hw4.entities.Gamer;

public class Main {

	public static void main(String[] args) {
		LocalDate dateOfBirth = LocalDate.of(1999, 10, 29);
		GamerManager gamerManager = new GamerManager(new MernisServiceAdapter());
		gamerManager.add(new Gamer(1, "Elif Gokce", "Atilgan", dateOfBirth,"1111111"));
		
		GameManager gameManager = new GameManager();
		gameManager.add(new Game(1,"Valorant",100));
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(new Campaign(2, "Mothers Day Campaign",50));
		
		SaleManager saleManager = new SaleManager();
		saleManager.sale(new Game(1,"Valorant",100), new Gamer(1, "Elif Gokce", "Atilgan", dateOfBirth, "11111111"));
		saleManager.campaignSale(
				
			         new Game(1,"Valorant",100),
			         new Gamer(1, "Elif Gokce", "Atilgan", dateOfBirth, "1111111"),
			         new Campaign(2, "Mothers Day Campaign",50)
			         );
	}

}
