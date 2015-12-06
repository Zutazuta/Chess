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
	
	private JPanel boardFrame;
	private JPanel[][] boardSquares;
	
	//The white pieces
	private JLabel wKing;
	private JLabel wQueen;
	private JLabel wBishop;
	private JLabel wKnight;
	private JLabel wRook;
	private JLabel wPawn;
	
	//The black pieces
	private JLabel bKing;
	private JLabel bQueen;
	private JLabel bBishop;
	private JLabel bKnight;
	private JLabel bRook;
	private JLabel bPawn;
	
	public Board() throws IOException {
		boardFrame = new JPanel(new GridLayout(0, 8));
    	boardSquares = new JPanel[8][8];
    	boardFrame.setBorder(new LineBorder(Color.BLACK));
    	generateImages();
	}
	
	

    public JPanel drawBoard(Piece[][] boardState) throws IOException {    	

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
    
    private JLabel determinePieceImage(Piece piece) {
    	
    }
    
    private void generateImages() throws IOException {
    	wKing = new JLabel(new ImageIcon(ImageIO.read(new File("art/wKing.png"))));
    	wKing.setSize(new Dimension(64, 64));
    	
    	wQueen = new JLabel(new ImageIcon(ImageIO.read(new File("art/wQueen.png"))));
    	wQueen.setSize(new Dimension(64, 64));
    	
    	wBishop = new JLabel(new ImageIcon(ImageIO.read(new File("art/wBishop.png"))));
    	wBishop.setSize(new Dimension(64, 64));
    	
    	wKnight = new JLabel(new ImageIcon(ImageIO.read(new File("art/wKnight.png"))));
    	wKnight.setSize(new Dimension(64, 64));
    	
    	wRook = new JLabel(new ImageIcon(ImageIO.read(new File("art/wRook.png"))));
    	wRook.setSize(new Dimension(64, 64));
    	
    	wPawn = new JLabel(new ImageIcon(ImageIO.read(new File("art/wPawn.png"))));
    	wPawn.setSize(new Dimension(64, 64));
    	
    	bKing = new JLabel(new ImageIcon(ImageIO.read(new File("art/bKing.png"))));
    	bKing.setSize(new Dimension(64, 64));
    	
    	bQueen = new JLabel(new ImageIcon(ImageIO.read(new File("art/bQueen.png"))));
    	bQueen.setSize(new Dimension(64, 64));
    	
    	bBishop = new JLabel(new ImageIcon(ImageIO.read(new File("art/bBishop.png"))));
    	bBishop.setSize(new Dimension(64, 64));
    	
    	bKnight = new JLabel(new ImageIcon(ImageIO.read(new File("art/bKnight.png"))));
    	bKnight.setSize(new Dimension(64, 64));
    	
    	bRook = new JLabel(new ImageIcon(ImageIO.read(new File("art/bRook.png"))));
    	bRook.setSize(new Dimension(64, 64));
    	
    	bPawn = new JLabel(new ImageIcon(ImageIO.read(new File("art/bPawn.png"))));
    	bPawn.setSize(new Dimension(64, 64));
    }
}
