package GameDemo;

import java.time.LocalDate;

import Adapters.MernisServiceAdapter;
import Concrete.GamerManager;
import Concrete.SaleManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) {
		
		Game game1 = new Game(1, "Counter-Strike", 100 , "Video Game");
		Game game2 = new Game(2, "MineCraft", 70, "Mobile Game");
		
		Campaign campaign1 = new Campaign(1000,"Student Campaign", 25);
		
		Gamer gamer1 = new Gamer(100000, "Ravzanur", "Cantürk", LocalDate.of(2000,10,24), "000");
		Gamer gamer2 = new Gamer(100000, "Ali", "Can", LocalDate.of(1999,10,25), "001");
		
		GamerManager gamerManager = new GamerManager(new MernisServiceAdapter());
		gamerManager.add(gamer1);
		
		SaleManager saleManager = new SaleManager();
		saleManager.sell(game1, gamer1);
		saleManager.sellWithCampaign(game2, gamer2, campaign1);
		
	}

}
