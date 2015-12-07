package chess.simulator;

import java.io.IOException;

import javax.swing.JFrame;

import chess.components.Board;
import chess.components.Piece;
import chess.gui.RenderController;
import chess.movement.MovementController;

public class Game {
	private boolean gameOver;
	
	private int turnCount;
	
	private Piece[][] boardState;
	
	private Board board;
	
	private RenderController renderController;
	
	private MovementController movementController;
	
	public Game() throws IOException {
		board = new Board();
		boardState = new Piece[8][8];
		gameOver = false;
		turnCount = 0;
		
		renderController = new RenderController();
		movementController = new MovementController();
		
		boardState = movementController.initialBoardState(boardState);
		renderController.drawGui(board, boardState);
	}
	
	public void playSimulatedGame() throws InterruptedException {
		while (!gameOver) {
			if (turnCount % 2 == 0) {
				boardState = movementController.whiteTurn(boardState);
				renderController.drawBoardState(board, boardState);

				Thread.sleep(1000);
			} else {
				boardState = movementController.blackTurn(boardState);
				renderController.drawBoardState(board, boardState);

				Thread.sleep(1000);
			}

			turnCount++;
		}
	}
}
