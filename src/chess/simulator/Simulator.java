package chess.simulator;

import java.io.IOException;

public class Simulator {

	public static void main(String[] args) throws IOException, InterruptedException {
		Game game = new Game();		
		game.playSimulatedGame();
	}
}
