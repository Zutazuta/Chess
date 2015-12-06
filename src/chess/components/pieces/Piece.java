package chess.components.pieces;

public class Piece {

	private String color;
	private String type;

	public Piece(String color, String type) {
		this.color = color;
		this.type = type;
	}

	public String getName() {
		return color + " " + type;
	}
}
