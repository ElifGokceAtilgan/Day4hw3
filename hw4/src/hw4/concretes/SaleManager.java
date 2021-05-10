package hw4.concretes;

import hw4.abstracts.SaleService;
import hw4.entities.Campaign;
import hw4.entities.Game;
import hw4.entities.Gamer;

public class SaleManager implements SaleService {

	@Override
	public void sale(Game game, Gamer gamer) {
		System.out.println(gamer.getFirstName() + " bought the game named : " + game.getName() + game.getUnitPrice() + " $ ");
		
	}

	@Override
	public void campaignSale(Game game, Gamer gamer, Campaign campaign) {
		System.out.println(gamer.getFirstName() + " bought the game named :  " + game.getName() + " with campaign :  " + campaign.getName());
        System.out.println("Price With Campaign : " + (game.getUnitPrice() -campaign.getDiscount()));
	}
}
