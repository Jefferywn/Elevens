public class DeckTester {

   public static void main(String[] args) {
      String[] ranks = {"Jack", "Queen","King"};
      String[] suits = {"Spades", "Hearts"};
      int[] pointValues = {11,12,13};
      
		Deck deck1 = new Deck(ranks, suits, pointValues);

		System.out.println("**** Original Deck ****");
		System.out.println("  toString:\n" + deck1.toString());
		System.out.println("  isEmpty: " + deck1.isEmpty());
		System.out.println("  size: " + deck1.size());
		System.out.println();
		System.out.println();

		System.out.println("**** Deal a Card ****");
		System.out.println("  deal: " + deck1.deal());
		System.out.println();
		System.out.println();

		System.out.println("**** Deck Values After 1 Card Dealt ****");
		System.out.println("  toString:\n" + deck1.toString());
		System.out.println("  isEmpty: " + deck1.isEmpty());
		System.out.println("  size: " + deck1.size());
		System.out.println();
		System.out.println();

		System.out.println("**** Deal Remaining 5 Cards ****");
		for (int i = 0; i < 5; i++) {
			System.out.println("  deal: " + deck1.deal());
		}
		System.out.println();
		System.out.println();

		System.out.println("**** Deck  Values After All Cards Dealt ****");
		System.out.println("  toString:\n" + deck1.toString());
		System.out.println("  isEmpty: " + deck1.isEmpty());
		System.out.println("  size: " + deck1.size());
		System.out.println();
		System.out.println();

		System.out.println("**** Deal a Card From Empty Deck ****");
		System.out.println("  deal: " + deck1.deal());
		System.out.println();
		System.out.println();
   }
}