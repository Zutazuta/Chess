package chess.components;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.*;

import chess.components.pieces.Piece;

public class Board {
	
	JPanel boardFrame;
	JPanel[][] boardSquares;
	
	public Board() {
		boardFrame = new JPanel(new GridLayout(0, 8));
    	boardSquares = new JPanel[8][8];
    	boardFrame.setBorder(new LineBorder(Color.BLACK));
	}

    public JPanel drawBoard(Piece[][] boardState) throws IOException {    	

        for (int i = 0; i < boardSquares.length; i++) {
            for (int j = 0; j < boardSquares.length; j++) {
                JPanel square = new JPanel();

                if ((j % 2 == 1 && i % 2 == 1) || (j % 2 == 0 && i % 2 == 0)) {
                	square.setBackground(Color.WHITE);
                	BufferedImage image = ImageIO.read(new File("art/wRook.png"));
                	JLabel label = new JLabel(new ImageIcon(image));
                	label.setSize(new Dimension(64, 64));
                	square.add(label);
                } else {
                	square.setBackground(Color.BLACK);
                	BufferedImage image = ImageIO.read(new File("art/bRook.png"));
                	JLabel label = new JLabel(new ImageIcon(image));
                	label.setSize(new Dimension(64, 64));
                	square.add(label);
                	
                }
                boardFrame.add(square);
            }           
        }
        
        return boardFrame;
    }
}
