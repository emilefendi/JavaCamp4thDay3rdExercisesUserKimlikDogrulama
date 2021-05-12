package entities;

public class Game {
	private int id;
	private String name;
	private String gameContent;
	private double unitPrice;
	
	public Game() {
		
	}

	public Game(int id, String name, String gameContent, double unitPrice) {
		super();
		this.id = id;
		this.name = name;
		this.gameContent = gameContent;
		this.unitPrice = unitPrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGameContent() {
		return gameContent;
	}

	public void setGameContent(String gameContent) {
		this.gameContent = gameContent;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
}
