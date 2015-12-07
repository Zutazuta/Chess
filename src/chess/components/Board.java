package chess.components;

import java.awt.*;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.*;

public class Board {

	private JPanel boardFrame;
	private JPanel[][] boardSquares;

	public Board() throws IOException {
		boardFrame = new JPanel(new GridLayout(0, 8));
		boardSquares = new JPanel[8][8];
		boardFrame.setBorder(new LineBorder(Color.BLACK));
	}

	public JPanel drawBoard(Piece[][] boardState) throws IOException {

		boardFrame.removeAll();
		boardSquares = new JPanel[8][8];

		for (int i = 0; i < boardSquares.length; i++) {
			for (int j = 0; j < boardSquares.length; j++) {
				JPanel square = new JPanel();

				if ((j % 2 == 1 && i % 2 == 1) || (j % 2 == 0 && i % 2 == 0)) {
					square.setBackground(Color.WHITE);
					if (boardState[i][j] != null) {
						square.add(determinePiece(boardState[i][j]));
					}

				} else {
					square.setBackground(Color.gray);
					if (boardState[i][j] != null) {
						square.add(determinePiece(boardState[i][j]));
					}
				}
				boardFrame.add(square);
			}
		}
		return boardFrame;
	}

	private JLabel determinePiece(Piece piece) throws IOException {

		if (piece.getPieceColor() == PieceColor.WHITE) {
			switch (piece.getPieceType().name()) {
			case ("KING"):
				JLabel wKing = new JLabel(new ImageIcon(ImageIO.read(new File("art/wKing.png"))));
				wKing.setSize(new Dimension(64, 64));
				return wKing;

			case ("QUEEN"):
				JLabel wQueen = new JLabel(new ImageIcon(ImageIO.read(new File("art/wQueen.png"))));
				wQueen.setSize(new Dimension(64, 64));
				return wQueen;

			case ("BISHOP"):
				JLabel wBishop = new JLabel(new ImageIcon(ImageIO.read(new File("art/wBishop.png"))));
				wBishop.setSize(new Dimension(64, 64));
				return wBishop;

			case ("KNIGHT"):
				JLabel wKnight = new JLabel(new ImageIcon(ImageIO.read(new File("art/wKnight.png"))));
				wKnight.setSize(new Dimension(64, 64));
				return wKnight;

			case ("ROOK"):
				JLabel wRook = new JLabel(new ImageIcon(ImageIO.read(new File("art/wRook.png"))));
				wRook.setSize(new Dimension(64, 64));
				return wRook;

			case ("PAWN"):
				JLabel wPawn = new JLabel(new ImageIcon(ImageIO.read(new File("art/wPawn.png"))));
				wPawn.setSize(new Dimension(64, 64));
				return wPawn;

			default:
				throw new IllegalArgumentException();
			}
		} else {
			switch (piece.getPieceType().name()) {
			case ("KING"):
				JLabel bKing = new JLabel(new ImageIcon(ImageIO.read(new File("art/bKing.png"))));
				bKing.setSize(new Dimension(64, 64));
				return bKing;

			case ("QUEEN"):
				JLabel bQueen = new JLabel(new ImageIcon(ImageIO.read(new File("art/bQueen.png"))));
				bQueen.setSize(new Dimension(64, 64));
				return bQueen;

			case ("BISHOP"):
				JLabel bBishop = new JLabel(new ImageIcon(ImageIO.read(new File("art/bBishop.png"))));
				bBishop.setSize(new Dimension(64, 64));
				return bBishop;

			case ("KNIGHT"):
				JLabel bKnight = new JLabel(new ImageIcon(ImageIO.read(new File("art/bKnight.png"))));
				bKnight.setSize(new Dimension(64, 64));
				return bKnight;

			case ("ROOK"):
				JLabel bRook = new JLabel(new ImageIcon(ImageIO.read(new File("art/bRook.png"))));
				bRook.setSize(new Dimension(64, 64));
				return bRook;

			case ("PAWN"):
				JLabel bPawn = new JLabel(new ImageIcon(ImageIO.read(new File("art/bPawn.png"))));
				bPawn.setSize(new Dimension(64, 64));
				return bPawn;

			default:
				throw new IllegalArgumentException();

			}
		}
	}
}
