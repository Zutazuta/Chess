package chess.components;

import java.util.List;

import chess.movement.Move;

public class Piece {

	private PieceColor color;
	private PieceType type;
	
	private List<Move> availableMoves;

	public Piece(PieceColor color, PieceType type) {
		this.color = color;
		this.type = type;
	}

	public PieceColor getPieceColor() {
		return color;
	}
	
	public PieceType getPieceType() {
		return type;
	}
}
