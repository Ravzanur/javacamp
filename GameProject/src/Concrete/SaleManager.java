package Concrete;

import Abstract.SaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class SaleManager implements SaleService{

	@Override
	public void sell(Game game, Gamer gamer) {
		System.out.println("Kullanýcý : " + gamer.getFirstName() +" "+ gamer.getLastName());
		System.out.println("Oyun : " + game.getGameName());
		System.out.println(game.getPrice() + "TL'ye oyun alýndý.");
		
	}

	@Override
	public void sellWithCampaign(Game game, Gamer gamer, Campaign campaign) {
		System.out.println("Kullanýcý : " + gamer.getFirstName() +" "+ gamer.getLastName());
		System.out.println("Oyun : " + game.getGameName());
		System.out.println(game.getPrice()-campaign.getDiscountAmount() + "TL'ye " + campaign.getCampaignName() + " ile oyun alýndý.");
		
	}

}
