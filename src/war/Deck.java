package war;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {

  static List<Card> cards;
  Random r;

  public Deck() {
    cards = new ArrayList<>();

    for (int i = 0; i < Card.Name.getNameLength(); i++) {
      for (int ii = 0; ii < Card.Value.getValueLength(); ii++) {
        Card card = new Card(Card.Name.getNames(i), Card.Value.getValue(ii), ii);
        cards.add(card);
      }
    }
  }

  public void shuffle() {
    int limit = cards.size();
    r = new Random();

    for (int i = limit; i > 0; i--) {
      int x = r.nextInt(limit);
      Card temp = cards.get(i - 1);
      cards.set(i - 1, cards.get(x));
      cards.set(x, temp);
    }
  }

  public Card draw() {
    return cards.remove(0);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("Deck:\n");

    for (Card c : cards) {
      builder.append(" ").append(c);
    }
    return builder.toString();
  }
}
