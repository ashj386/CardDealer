import java.util.Arrays;
import java.util.List;


public class Card {
  private String rank, suit;
  public int value;

  public Card(String rank, String suit){
    setRank(rank);
    setSuit(suit);
  }

  public String getRank() {
    return rank;
  }

  public static List<String> getValidRank (){
    return Arrays.asList("Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King");

  }

  public void setRank(String rank) {
    List<String> validRanks = getValidRank();
    if (validRanks.contains(rank))
    this.rank = rank;

  }

  public String getSuit() {
    return suit;
  }

public static List<String> getValidSuits (){
    return Arrays.asList("Spades", "Hearts", "Diamonds","Clubs");

  }

  public void setSuit(String suit){
    List<String> validSuits = getValidSuits();
    if (validSuits.contains(suit))
    this.suit = suit;
  }

  public String toString() {
    return String.format("%s of %s", rank, suit);
  }
}