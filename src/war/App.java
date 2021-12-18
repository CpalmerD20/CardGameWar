package war;

public class App {

  public static void main(String[] args) {

    var deck = new Deck();
    var p1 = new Player("One");
    var p2 = new Player("Two");

    deck.shuffle();
    System.out.println("The Game of War Begins!!! \n");

    for (int i = 0; i < 52; i++) {
      if (i % 2 != 0) {
        p1.drawCard(deck);
        } else {
        p2.drawCard(deck);
        }
    }

    for (int i = 0; i < 26; i++) {
      System.out.println("> Round " + (i + 1) + "\n");
      Card cardP1 = p1.flip();
      Card cardP2 = p2.flip();

      if (cardP1.getPow() == cardP2.getPow()) {
        System.out.println("Tie!!! " + cardP1 + " & " + cardP2 + "! \n");
        
      } else if (cardP1.getPow() > cardP2.getPow()) {
        p1.winRound();
        System.out.println("Player " + p1.getName() + "'s " + cardP1 + 
                    " beats Player " + p2.getName() + "'s " + cardP2);
        System.out.println(">> Player " + p1.getName() + "'s score: " + p1.getScore() + "\n"
                         + ">> Player " + p2.getName() + "'s score: " + p2.getScore() + "\n");
      } else {
        p2.winRound();
        System.out.println("Player " + p2.getName() + "'s " + cardP2 + 
                    " beats Player " + p1.getName() + "'s " + cardP1);
        System.out.println(">> Player " + p1.getName() + "'s score: " + p1.getScore() + "\n"
                         + ">> Player " + p2.getName() + "'s score: " + p2.getScore() + "\n");
      }
    }

    System.out.println("***Final Scores***");
    if (p1.getScore() > p2.getScore()) {
      System.out.println("Player " + p1.getName() + " beats Player " + p2.getName() + 
               " with a score of " + p1.getScore() + " to " + p2.getScore());
    } else if (p2.getScore() > p1.getScore()) {
      System.out.println("Player " + p2.getName() + " beats Player " + p1.getName() + 
               " with a score of " + p2.getScore() + " to " + p1.getScore());
    } else {
      System.out.println("The game is a tie!!! Player " + p1.getName() +
          " & " + p2.getName() + " have " + "a score of " + p1.getScore());
    }
  }
}
