import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardDeck {
  private ArrayList<Card> deck;
  private int nxtCard;

  public CardDeck(ArrayList<Card> deck, int nxtCard) {
    this.deck = deck;
    nxtCard = 0;

  }

  public CardDeck() {
    List<String> suits = Card.getValidSuits();
    List<String> ranks = Card.getValidRank();
    deck = new ArrayList<>();

    for (String suit:suits){
      for (String rank:ranks)
      deck.add(new Card(rank,suit));
    }
  }
  public void displayDeck(){
    for (Card card: deck)
      System.out.println(card);
  }
  public ArrayList<Card> getDeck(){
    return deck;
  }
  public void setDeck(ArrayList<Card> deck) {
        this.deck = deck;
    }
  public void shuffle() {
        Collections.shuffle(deck);
    }
  public Card deal(){
    if (nxtCard < deck.size())
      return deck.get(nxtCard++);

    else
      return null;
  }
  
  
}