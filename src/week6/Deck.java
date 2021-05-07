package week6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
//	public static <E> void swap(List<E> a, int i, int j) {
//	    E tmp = a.get(i);
//	    a.set(i, a.get(j));
//	    a.set(j, tmp);
//	}	
	
	public void shuffle() { //shuffle(List<Card> list)
//		Random r = new Random();
//		for (int i = 1; i < list.size(); i++) {
//        swap(list, i, r.nextInt(i));
//	    }
// Got the above code to work, but would only shuffle inside this class.
		Collections.shuffle(cards);
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Deck:\n");
		for(Card card: cards) {
			builder.append(" ").append(card);
		}
		return builder.toString();
		
	}
	public Card draw() {
		return cards.remove(0);
	}
	static List<Card> cards = new ArrayList<>();

	public Deck() {
		for(int i = 0; i < Card.Name.getNameLength(); i++ ) {
			for(int ii = 0; ii < Card.Value.getValueLength(); ii++) {
				Card card = new Card(Card.Name.getNames(i), Card.Value.getValue(ii),ii);
				cards.add(card);
			}
		}
	}
}
