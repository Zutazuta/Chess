package chess.gui;

import java.awt.Dimension;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import chess.components.Board;
import chess.components.pieces.Piece;


public class GraphicalUserInterface {

	private static final int SQUARE_LENGTH = 64;
	private static final int BOARD_LENGTH = SQUARE_LENGTH * 8;
	private static Piece[][] boardState;
	private static final String BLACK = "BLACK";
	private static final String WHITE = "WHITE";
	private static final String KING = "KING";
	private static final String QUEEN = "QUEEN";
	private static final String KNIGHT = "KNIGHT";
	private static final String BISHOP = "BISHOP";
	private static final String ROOK = "ROOK";
	private static final String PAWN = "PAWN";
	
	
	public static void main(String[] args) {

		boardState = new Piece[8][8];
		Runnable r = new Runnable() {

			@Override
			public void run() {
				Board board;
				try {
					board = new Board();				
					
					JFrame mainFrame = new JFrame();
					initializeBoardState();
					mainFrame.add(board.drawBoard(boardState));
					mainFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					mainFrame.setLocationByPlatform(true);
					mainFrame.pack();
					mainFrame.setMinimumSize(new Dimension(BOARD_LENGTH, BOARD_LENGTH));
					mainFrame.setVisible(true);
				} catch (Exception ex) {
					System.out.println("Something went wrong!");
					ex.printStackTrace();
				}
			}
		};
		SwingUtilities.invokeLater(r);
	}

	private static void initializeBoardState(){

		Piece peace;
		peace = new Piece(WHITE,ROOK);
		boardState[0][0] = peace;
		boardState[0][7] = peace;
		peace = new Piece(BLACK,ROOK);
		boardState[7][0] = peace;
		boardState[7][7] = peace;
			
		
		peace = new Piece(WHITE,KING);
		boardState[0][3] = peace;
	    peace = new Piece(BLACK,KING);
		boardState[7][3] = peace;
		
		
		peace = new Piece(WHITE,QUEEN);
		boardState[0][4] = peace;
	    peace = new Piece(BLACK,QUEEN);
		boardState[7][4] = peace;
		
		
		peace = new Piece(WHITE,KNIGHT);
		boardState[0][1] = peace;
		boardState[0][6] = peace;
		peace = new Piece(BLACK,KNIGHT);
		boardState[7][1] = peace;
		boardState[7][6] = peace;
		
		peace = new Piece(WHITE,BISHOP);
		boardState[0][2] = peace;
		boardState[0][5] = peace;
		peace = new Piece(BLACK,BISHOP);
		boardState[7][2] = peace;
		boardState[7][5] = peace;
		
		
		peace = new Piece(WHITE,PAWN);
		for(int i = 0; i < 8; i++)
		{
			boardState[1][i] = peace;
		}
			
		
		peace = new Piece(BLACK,PAWN);
		for(int i = 0; i < 8; i++)
		{
			boardState[6][i] = peace;
		}
		
		
	}

}
