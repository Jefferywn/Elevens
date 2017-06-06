public class Card 
{
	public String suit;
   public String rank;
	public int pointValue;

   public Card(String cardRank, String cardSuit, int cardPointValue) {
		rank = cardRank;
      suit = cardSuit;
      pointValue = cardPointValue;
	}
   public String suit() {
		return suit;
   }

	public String rank() {
		return rank;
	}

	public int pointValue() {
      return pointValue;
	}

	public boolean matches(Card otherCard) {
	   if(suit.equals(otherCard.suit()) 
      && rank.equals(otherCard.rank()) 
      && pointValue == otherCard.pointValue())
      {
      return true;
      }
      else
      {
      return false;
      }
	}

	@Override
	public String toString() {
		return rank + " of " + suit + "(point value = " + pointValue + ")";
	}
}