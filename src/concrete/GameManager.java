package concrete;

import java.util.List;

import abstracts.GameService;
import entities.Game;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println("Game added");
	}

	@Override
	public void delete(Game game) {
		System.out.println("Game deleted");
	}

	@Override
	public void update(Game game) {
		System.out.println("Game updated");
	}

	@Override
	public String getGame(Game game) {
		return game.getName()+":"+game.getGameContent();
	}

	@Override
	public List<Game> getAll() {
		return null;
	}

}
