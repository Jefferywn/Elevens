import java.util.List;
import java.util.ArrayList;
public class Deck 
{
	public static List<Card> cards;
   public static int size;
   public static int[] hand;
   public static Card temp;
   public static int j = 0;
   public static int[] hand2;

  
  
   public Deck(String[] ranks, String[] suits, int[] values) {
      cards = new ArrayList<Card>();
      for(int i = 0;i < ranks.length;i++)
      {
         for(int j = 0;j < suits.length;j++)
         {
            cards.add(new Card(ranks[i],suits[j],values[i]));
         }
      }
      size = cards.size();
      hand = new int[size];
     

      for(int z = 0;z < hand.length;z++)
         {
         hand[z] = z;
         }
      shuffle();
	}

   public boolean isEmpty() {
		return size == 0;
	}

	public static int size() {
		return size;
	}

	public static void shuffle() {
  // Setting a new array's values to the shuffled deck
		Shuffler.perfectShuffle(hand);
  // Switching the card at each position with a random card based on the shuffled deck
      for(int i = 0;i < hand.length;i++)
        {
            j = hand[i];
            temp = cards.get(i);
            cards.set(i, cards.get(j)) ;
            cards.set(j, temp);
        }  
	}

	public Card deal() {
		if(isEmpty())
      {
      return null;
      }
      size--;
      return cards.get(size);
	}

	@Override
	public String toString() {
		String rtn = "size = " + size + "\nUndealt cards: \n";

		for (int k = size - 1; k >= 0; k--) {
			rtn = rtn + cards.get(k);
			if (k != 0) {
				rtn = rtn + ", ";
			}
			if ((size - k) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\nDealt cards: \n";
		for (int k = cards.size() - 1; k >= size; k--) {
			rtn = rtn + cards.get(k);
			if (k != size) {
				rtn = rtn + ", ";
			}
			if ((k - cards.size()) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}
      rtn = rtn + "\n";
		return rtn;
      }
}