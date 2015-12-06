package chess.gui;

import java.io.IOException;

import javax.swing.JFrame;
import chess.components.Board;
import chess.components.Piece;
import chess.movement.MovementController;

public class Game {

	private static boolean gameOver = false;

	public static void main(String[] args) throws IOException, InterruptedException {

		Board board = new Board();
		Piece[][] boardState = new Piece[8][8];
		
		boardState = MovementController.initialBoardState(boardState);
		JFrame gui = RenderController.drawGui(board, boardState);
		Thread.sleep(2000);
		int turnCount = 0;

		while (!gameOver) {
			if (turnCount % 2 == 0) {
				boardState = MovementController.whiteTurn(boardState);
				RenderController.drawBoardState(gui, board, boardState);

				Thread.sleep(1000);
			} else {
				boardState = MovementController.blackTurn(boardState);
				RenderController.drawBoardState(gui, board, boardState);

				Thread.sleep(1000);
			}

			turnCount++;
		}
	}
}
