package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public interface SaleService {
	void sell(Game game, Gamer gamer);
	void sellWithCampaign(Game game, Gamer gamer, Campaign campaign);
}
