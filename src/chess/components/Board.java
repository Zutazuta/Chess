package chess.components;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

import chess.components.pieces.Piece;

public class Board {

    public JPanel drawBoard(Piece[][] boardState) {
    	JPanel boardFrame = new JPanel(new GridLayout(0, 8));
    	JPanel[][] boardSquares = new JPanel[8][8];
    	
    	boardFrame.setBorder(new LineBorder(Color.BLACK));

        for (int i = 0; i < boardSquares.length; i++) {
            for (int j = 0; j < boardSquares.length; j++) {
                JPanel square = new JPanel();

                if ((j % 2 == 1 && i % 2 == 1) || (j % 2 == 0 && i % 2 == 0)) {
                	square.setBackground(Color.WHITE);
                } else {
                	square.setBackground(Color.BLACK);
                }
                boardFrame.add(square);
            }           
        }

        
        return boardFrame;
    }
}
