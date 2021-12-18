package war;

import java.util.ArrayList;
import java.util.List;

public class Player {
  private List<Card> hand;
  private int score = 0;
  private String name;

  public Player(String name) {
    hand = new ArrayList<Card>();
    this.name = name;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("Player").append(name).append(" has ").append(score).append(" points. \n")
        .append("Hand: \n");

    for (Card card : hand) {
      builder.append(" ").append(card).append("\n:");
    }
    return builder.toString();
  }

  public void drawCard(Deck deck) {
    hand.add(deck.draw());
  }

  public Card flip() {
    return hand.remove(0);
  }

  public void winRound() {
    score = getScore() + 1;
  }

  public int getScore() {
    return score;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
