package abstracts;

import entities.Campaign;
import entities.Game;
import entities.User;

public interface SaleService {

	void sale(User user, Game game);

	void saleWithCampaign(User user, Game game, Campaign campaign);

}
