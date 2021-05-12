package concrete;

import abstracts.SaleService;
import entities.Campaign;
import entities.Game;
import entities.User;

public class SaleManager implements SaleService{

	@Override
	public void sale(User user, Game game) {
		System.out.println(user.getFirstName()+" adli oyuncu "+game.getName()+"adli oyunu satin aldi.");
	}

	@Override
	public void saleWithCampaign(User user, Game game, Campaign campaign) {
		System.out.println(user.getFirstName()+" adli oyuncu "+campaign.getCampaignName()
		+"adli kampanya ile "+game.getName()+" adli oyunu satin aldi");
	}

}
