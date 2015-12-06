package chess.components;

import java.util.List;

import chess.movement.Move;

public class Piece {

	private String color;
	private String type;
	
	private List<Move> availableMoves;

	public Piece(String color, String type) {
		this.color = color;
		this.type = type;
	}

	public String getName() {
		return color + " " + type;
	}
}
