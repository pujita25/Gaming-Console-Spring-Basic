package com.in28Minutes.learnspringframework;

import com.in28Minutes.learnspringframework.game.GameRunner;
import com.in28Minutes.learnspringframework.game.MarioGame;
import com.in28Minutes.learnspringframework.game.PacmanGame;
import com.in28Minutes.learnspringframework.game.SuperContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		//Mario game is tightly coupled to the Game runner. If
		//you have to change and create new game (superContraGame) you have to update the code every time - Tightly Coupled
//		var superContraGame = new SuperContraGame();
//		var marioGame = new MarioGame();
		var game = new PacmanGame(); //Object creation
		var gameRunner = new GameRunner(game); //Object creation + wiring of dependencies
		//Game is dependency of game runner (injected to game runner)
		gameRunner.run();
	}

}
