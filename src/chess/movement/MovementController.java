package chess.movement;

import chess.components.Piece;

public class MovementController {
	
	private static final String BLACK = "BLACK";
	private static final String WHITE = "WHITE";
	private static final String KING = "KING";
	private static final String QUEEN = "QUEEN";
	private static final String KNIGHT = "KNIGHT";
	private static final String BISHOP = "BISHOP";
	private static final String ROOK = "ROOK";
	private static final String PAWN = "PAWN";
	
	public static Piece[][] initialBoardState(Piece[][] boardState) {
		Piece piece = new Piece(WHITE, ROOK);
		boardState[0][0] = piece;
		boardState[0][7] = piece;
		piece = new Piece(BLACK, ROOK);
		boardState[7][0] = piece;
		boardState[7][7] = piece;

		piece = new Piece(WHITE, KING);
		boardState[0][3] = piece;
		piece = new Piece(BLACK, KING);
		boardState[7][3] = piece;

		piece = new Piece(WHITE, QUEEN);
		boardState[0][4] = piece;
		piece = new Piece(BLACK, QUEEN);
		boardState[7][4] = piece;

		piece = new Piece(WHITE, KNIGHT);
		boardState[0][1] = piece;
		boardState[0][6] = piece;
		piece = new Piece(BLACK, KNIGHT);
		boardState[7][1] = piece;
		boardState[7][6] = piece;

		piece = new Piece(WHITE, BISHOP);
		boardState[0][2] = piece;
		boardState[0][5] = piece;
		piece = new Piece(BLACK, BISHOP);
		boardState[7][2] = piece;
		boardState[7][5] = piece;

		piece = new Piece(WHITE, PAWN);
		for (int i = 0; i < 8; i++) {
			boardState[1][i] = piece;
		}

		piece = new Piece(BLACK, PAWN);
		for (int i = 0; i < 8; i++) {
			boardState[6][i] = piece;
		}
		
		return boardState;
	}
	
	public static Piece[][] whiteTurn(Piece[][] boardState) {

		Piece piece = new Piece(WHITE, PAWN);
		for (int i = 0; i < 8; i++) {
			boardState[2][i] = piece;
		}
		
		return boardState;
	}

	public static Piece[][] blackTurn(Piece[][] boardState) {

		Piece peace = new Piece(BLACK, PAWN);
		for (int i = 0; i < 8; i++) {
			boardState[5][i] = peace;
		}
		
		return boardState;
	}
}
