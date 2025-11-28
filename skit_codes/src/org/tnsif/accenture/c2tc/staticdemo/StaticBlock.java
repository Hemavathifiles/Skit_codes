package org.tnsif.accenture.c2tc.staticdemo;
class Game
{
	
	static int maxlevel;
	
	//static block
	static
	{
		System.out.println("Initializing the game settings.....");
		maxlevel=50;
	}
	
	void showLeevelInfo()
	{
		System.out.println("Game has "+ maxlevel+" levels");
	}
}
public class StaticBlock {

	public static void main(String[] args) {
		Game game=new Game();
		game.showLeevelInfo();

	}

}
