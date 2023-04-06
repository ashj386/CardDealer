import java.util.Scanner;

class Main {
  public static void main(String[] args) {
   CardDeck deck = new CardDeck();
   System.out.println("Let's play Cards!");
  while(true){
   System.out.println("Press 1 to display full deck.");
   System.out.println("Press 2 to shuffle the deck.");
   System.out.println("Press 3 to deal a card.");
   System.out.println("Press 4 to quit.");
   System.out.print("Enter your option: ");
   int input;
   Scanner xcv = new Scanner(System.in);
   input = xcv.nextInt();
    //xcv.close();
   switch(input){
     case 1:
      deck.displayDeck();
      break;
     case 2:
      deck.shuffle();
      break;
     case 3:
      System.out.println(deck.deal());
      break;
     case 4: 
      System.exit(0);
   }
  }
  }
}