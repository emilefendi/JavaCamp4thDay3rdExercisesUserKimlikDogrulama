import abstracts.UserCheckService;
import adapters.MernisServiceAdapter;
import concrete.CampaignManager;
import concrete.GameManager;
import concrete.SaleManager;
import concrete.UserCheckManager;
import concrete.UserManager;
import entities.Campaign;
import entities.Game;
import entities.User;

public class Main {
	public static void main(String[] args) {
		UserManager userManager = new UserManager(new UserCheckManager());// xetali
		CampaignManager campaignManager = new CampaignManager();
		GameManager gameManager = new GameManager();
		SaleManager saleManager = new SaleManager();

		User user1 = new User(1, "Eda", "Camkiran", "1999", "00000001");
		Game game1 = new Game(1, "New Game1", "Game1", 100);
		Campaign campaign1 = new Campaign(1, "Campaign1", "New Campaign1", 50);

		try {
			userManager.add(user1);
			gameManager.add(game1);
			campaignManager.add(campaign1);
			saleManager.sale(user1, game1);
			saleManager.saleWithCampaign(user1, game1, campaign1);
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
