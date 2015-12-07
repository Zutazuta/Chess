package chess.gui;

import java.awt.Dimension;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import chess.components.Board;
import chess.components.Piece;

public class RenderController {
	
	private static final int SQUARE_LENGTH = 64;
	private static final int BOARD_LENGTH = SQUARE_LENGTH * 8;
	
	private JFrame gui;
	
	public void drawGui(Board board, Piece[][] boardState) throws IOException {		
		gui = new JFrame();
		gui.add(board.drawBoard(boardState));
		gui.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		gui.setLocationByPlatform(true);
		gui.pack();
		gui.setMinimumSize(new Dimension(BOARD_LENGTH, BOARD_LENGTH));
		gui.setVisible(true);
	}
	
	public void drawBoardState(Board board, Piece[][] boardState) {
		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				try {
					gui.add(board.drawBoard(boardState));
					gui.revalidate();
				} catch (IOException e) {
					System.out.println("Failed to render board state.");
				}				
			}			
		};
		SwingUtilities.invokeLater(runnable);
	}
}
