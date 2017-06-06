public class CardTester {
   public static void main(String[] args) {
		 Card card1 = new Card("Two","Hearts",2);
       Card card2 = new Card("Four","Hearts",4);
       Card card3 = new Card("Four","Spades",4);
       
       System.out.println(card1.toString());
       System.out.println(card2.toString());
       System.out.println(card3.toString());    
	}
}