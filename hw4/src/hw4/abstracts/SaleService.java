package hw4.abstracts;

import hw4.entities.Campaign;
import hw4.entities.Game;
import hw4.entities.Gamer;

public interface SaleService {
	void sale(Game game, Gamer gamer);
	void campaignSale(Game game, Gamer gamer, Campaign campaign);
}
