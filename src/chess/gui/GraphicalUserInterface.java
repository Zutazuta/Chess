package chess.gui;

import java.awt.Dimension;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
//Testing Adit
import chess.components.Board;

public class GraphicalUserInterface {
	
	private static final int SQUARE_LENGTH = 64;
    private static final int BOARD_LENGTH = SQUARE_LENGTH * 8;
	
	public static void main(String[] args) {
		
        Runnable r = new Runnable() {

            @Override
            public void run() {
                Board board = new Board();

                JFrame mainFrame = new JFrame();
                try {
					mainFrame.add(board.drawBoard(null));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                mainFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                mainFrame.setLocationByPlatform(true);
                mainFrame.pack();
                mainFrame.setMinimumSize(new Dimension(BOARD_LENGTH, BOARD_LENGTH));
                mainFrame.setVisible(true);
            }
        };
        SwingUtilities.invokeLater(r);
    }

}
