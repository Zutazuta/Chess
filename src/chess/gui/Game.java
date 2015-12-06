package chess.gui;

import java.awt.Dimension;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import chess.components.Board;
import chess.components.pieces.Piece;

public class Game {

	private static final int SQUARE_LENGTH = 64;
	private static final int BOARD_LENGTH = SQUARE_LENGTH * 8;

	private static final String BLACK = "BLACK";
	private static final String WHITE = "WHITE";
	private static final String KING = "KING";
	private static final String QUEEN = "QUEEN";
	private static final String KNIGHT = "KNIGHT";
	private static final String BISHOP = "BISHOP";
	private static final String ROOK = "ROOK";
	private static final String PAWN = "PAWN";
	
	private static Piece[][] boardState;
	private static boolean gameOver = false;

	public static void main(String[] args) throws IOException, InterruptedException {

		boardState = new Piece[8][8];
		Board board = new Board();
		initializeBoardState();
		JFrame gui = initializeGui(board);				
		Thread.sleep(2000);
		int turnCount = 0;
		
		while(!gameOver) {
			if(turnCount % 2 == 0) {
				gui.add(board.drawBoard(whiteTurn()));
				gui.revalidate();
				
				Thread.sleep(1000);
			} else {
				gui.add(board.drawBoard(blackTurn()));
				gui.revalidate();
				
				Thread.sleep(1000);
			}
			
			turnCount++;
		}
	}
	
	private static Piece[][] whiteTurn() {
		Piece[][] boardState1 = new Piece[8][8];
		
		Piece peace;
		peace = new Piece(WHITE, ROOK);
		boardState1[0][0] = peace;
		boardState1[0][7] = peace;
		peace = new Piece(BLACK, ROOK);
		boardState1[7][0] = peace;
		boardState1[7][7] = peace;

		peace = new Piece(WHITE, KING);
		boardState1[0][3] = peace;
		peace = new Piece(BLACK, KING);
		boardState1[7][3] = peace;

		peace = new Piece(WHITE, QUEEN);
		boardState1[0][4] = peace;
		peace = new Piece(BLACK, QUEEN);
		boardState1[7][4] = peace;

		peace = new Piece(WHITE, KNIGHT);
		boardState1[0][1] = peace;
		boardState1[0][6] = peace;
		peace = new Piece(BLACK, KNIGHT);
		boardState1[7][1] = peace;
		boardState1[7][6] = peace;

		peace = new Piece(WHITE, BISHOP);
		boardState1[0][2] = peace;
		boardState1[0][5] = peace;
		peace = new Piece(BLACK, BISHOP);
		boardState1[7][2] = peace;
		boardState1[7][5] = peace;

		peace = new Piece(WHITE, PAWN);
		for (int i = 0; i < 8; i++) {
			boardState1[2][i] = peace;
		}

		peace = new Piece(BLACK, PAWN);
		for (int i = 0; i < 8; i++) {
			boardState1[6][i] = peace;
		}
		return boardState1;
	}
	
	private static Piece[][] blackTurn() {
Piece[][] boardState1 = new Piece[8][8];
		
		Piece peace;
		peace = new Piece(WHITE, ROOK);
		boardState1[0][0] = peace;
		boardState1[0][7] = peace;
		peace = new Piece(BLACK, ROOK);
		boardState1[7][0] = peace;
		boardState1[7][7] = peace;

		peace = new Piece(WHITE, KING);
		boardState1[0][3] = peace;
		peace = new Piece(BLACK, KING);
		boardState1[7][3] = peace;

		peace = new Piece(WHITE, QUEEN);
		boardState1[0][4] = peace;
		peace = new Piece(BLACK, QUEEN);
		boardState1[7][4] = peace;

		peace = new Piece(WHITE, KNIGHT);
		boardState1[0][1] = peace;
		boardState1[0][6] = peace;
		peace = new Piece(BLACK, KNIGHT);
		boardState1[7][1] = peace;
		boardState1[7][6] = peace;

		peace = new Piece(WHITE, BISHOP);
		boardState1[0][2] = peace;
		boardState1[0][5] = peace;
		peace = new Piece(BLACK, BISHOP);
		boardState1[7][2] = peace;
		boardState1[7][5] = peace;

		peace = new Piece(WHITE, PAWN);
		for (int i = 0; i < 8; i++) {
			boardState1[2][i] = peace;
		}

		peace = new Piece(BLACK, PAWN);
		for (int i = 0; i < 8; i++) {
			boardState1[5][i] = peace;
		}
		return boardState1;
	}
	
	private static JFrame initializeGui(Board board) throws IOException {
		JFrame gui = new JFrame();
		gui.add(board.drawBoard(boardState));
		gui.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		gui.setLocationByPlatform(true);
		gui.pack();
		gui.setMinimumSize(new Dimension(BOARD_LENGTH, BOARD_LENGTH));
		gui.setVisible(true);
		
		return gui;
	}

	private static void initializeBoardState() {

		Piece peace;
		peace = new Piece(WHITE, ROOK);
		boardState[0][0] = peace;
		boardState[0][7] = peace;
		peace = new Piece(BLACK, ROOK);
		boardState[7][0] = peace;
		boardState[7][7] = peace;

		peace = new Piece(WHITE, KING);
		boardState[0][3] = peace;
		peace = new Piece(BLACK, KING);
		boardState[7][3] = peace;

		peace = new Piece(WHITE, QUEEN);
		boardState[0][4] = peace;
		peace = new Piece(BLACK, QUEEN);
		boardState[7][4] = peace;

		peace = new Piece(WHITE, KNIGHT);
		boardState[0][1] = peace;
		boardState[0][6] = peace;
		peace = new Piece(BLACK, KNIGHT);
		boardState[7][1] = peace;
		boardState[7][6] = peace;

		peace = new Piece(WHITE, BISHOP);
		boardState[0][2] = peace;
		boardState[0][5] = peace;
		peace = new Piece(BLACK, BISHOP);
		boardState[7][2] = peace;
		boardState[7][5] = peace;

		peace = new Piece(WHITE, PAWN);
		for (int i = 0; i < 8; i++) {
			boardState[1][i] = peace;
		}

		peace = new Piece(BLACK, PAWN);
		for (int i = 0; i < 8; i++) {
			boardState[6][i] = peace;
		}

	}

}
