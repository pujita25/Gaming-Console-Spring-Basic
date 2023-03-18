package com.in28Minutes.learnspringframework.game;

public class SuperContraGame implements GamingConsole {
	public void up() {
		System.out.println("up");
	}
	
	public void down() {
		System.out.println("down");
	}
	
	public void left() {
		System.out.println("go left");
	}
	
	public void right() {
		System.out.println("shoot bullets");
	}
}
