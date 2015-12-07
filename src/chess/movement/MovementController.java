package chess.movement;

import chess.components.Piece;
import chess.components.PieceColor;
import chess.components.PieceType;

public class MovementController {
	
	public Piece[][] initialBoardState(Piece[][] boardState) {
		Piece piece = new Piece(PieceColor.WHITE, PieceType.ROOK);
		boardState[0][0] = piece;
		boardState[0][7] = piece;
		piece = new Piece(PieceColor.BLACK, PieceType.ROOK);
		boardState[7][0] = piece;
		boardState[7][7] = piece;

		piece = new Piece(PieceColor.WHITE, PieceType.KING);
		boardState[0][3] = piece;
		piece = new Piece(PieceColor.BLACK, PieceType.KING);
		boardState[7][3] = piece;

		piece = new Piece(PieceColor.WHITE, PieceType.QUEEN);
		boardState[0][4] = piece;
		piece = new Piece(PieceColor.BLACK, PieceType.QUEEN);
		boardState[7][4] = piece;

		piece = new Piece(PieceColor.WHITE, PieceType.KNIGHT);
		boardState[0][1] = piece;
		boardState[0][6] = piece;
		piece = new Piece(PieceColor.BLACK, PieceType.KNIGHT);
		boardState[7][1] = piece;
		boardState[7][6] = piece;

		piece = new Piece(PieceColor.WHITE, PieceType.BISHOP);
		boardState[0][2] = piece;
		boardState[0][5] = piece;
		piece = new Piece(PieceColor.BLACK, PieceType.BISHOP);
		boardState[7][2] = piece;
		boardState[7][5] = piece;

		piece = new Piece(PieceColor.WHITE, PieceType.PAWN);
		for (int i = 0; i < 8; i++) {
			boardState[1][i] = piece;
		}

		piece = new Piece(PieceColor.BLACK, PieceType.PAWN);
		for (int i = 0; i < 8; i++) {
			boardState[6][i] = piece;
		}
		
		return boardState;
	}
	
	public Piece[][] whiteTurn(Piece[][] boardState) {

		determineLegalBoardStates(boardState);
		
		return boardState;
	}

	public Piece[][] blackTurn(Piece[][] boardState) {

		
		return boardState;
	}
	
	private void determineLegalBoardStates(Piece[][] boardState) {
		for(int i = 0; i < boardState.length; i++) {
			for(int j = 0; j < boardState.length; j++) {
				if(boardState[i][j] != null) {
					if(boardState[i][j].getPieceType() == PieceType.KNIGHT) {
						System.out.println("FOUND A KNIGHT AT " + i + " " + j);
					}
				}				
			}
		}
	}
}
