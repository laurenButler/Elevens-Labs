/**
 * This is a class that tests the Card class.
 */
public class CardTester { 
	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
   //
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card cardA = new Card("J", "Diamond", 5);
		Card cardB = new Card("J", "Diamond", 5);
		Card cardC = new Card("1", "Clubs", 2);
		
		System.out.println("card A and card B are equal? " + cardA.matches(cardB));
      System.out.println("card B and card C are equal? " + cardB.matches(cardC));
	}
}
