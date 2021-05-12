package abstracts;

import java.util.List;

import entities.Game;

public interface GameService {
	
	void add(Game game);
	void delete(Game game);
	void update(Game game);
	String getGame(Game game);
	List<Game> getAll();
}
