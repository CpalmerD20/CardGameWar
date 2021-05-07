package week6;

import java.util.Random;

public class App {
	
	static Random r = new Random();

	public static void main(String[] args) {
//3. Instantiate a Deck and two Players, call the shuffle method on the deck.
		Player p1 = new Player("One");
		Player p2 = new Player("Two");
		Deck deck = new Deck();
		deck.shuffle();

		System.out.println("The Game of War Begins!!! \n");

		
//4. Using a traditional for loop, iterate 52 times calling the Draw method 
//   on the other player each iteration using the Deck you instantiated.
		for(int i = 0; i < 52; i++) {
			if (i % 2 != 0) {
				p1.drawCard(deck);
			} else {
				p2.drawCard(deck);
			}
		}
					
//5. Using a traditional for loop, iterate 26 times and call the flip method for each player.
		for(int i = 0; i < 26; i++) {
			System.out.println("> Round " + (i + 1) + "\n" );
			Card c = p1.flip();
			Card d = p2.flip();
			//a. Compare the value of each card returned by the two player’s flip methods.			
			//	 Call the incrementScore method on the player whose card has the higher value.
			if (c.getPow() == d.getPow()) {
				System.out.println("Tie!!! " + c + " & " + d + "! \n");
			} else if (c.getPow() > d.getPow()) {
				p1.winRound();
				System.out.println("Player One's " + c + " beats Player Two's " + d);
				System.out.println(">> Player One's score: " + p1.getScore() + "\n" +
						">> Player Two's score: " + p2.getScore() + "\n" );
			} else {
				p2.winRound();
				System.out.println("Player Two's " + d + " beats Player One's " + c );
				System.out.println(">> Player One's score: " + p1.getScore() + "\n" +
						">> Player Two's score: " + p2.getScore() + "\n" );
			
			}
			
		}
		
//6. After the loop, compare the final score from each player. 
//7. Print the final score of each player and either “Player 1”, “Player 2”, 
//   or “Draw” depending on which score is higher or if they are both the same.
		System.out.println("***Final Scores***");
		if (p1.getScore() > p2.getScore()) {
			System.out.println("Player One beats Player Two with a score of " + 
					p1.getScore() + " to " + p2.getScore());
		} else if (p2.getScore() > p1.getScore()) {
			System.out.println("Player Two beats Player One with a score of " + 
					p2.getScore() + " to " + p1.getScore());
		} else {
			System.out.println("The game is a tie!!! Player One & Two have "
					+ "a score of " + p1.getScore());
		}
	}
}
