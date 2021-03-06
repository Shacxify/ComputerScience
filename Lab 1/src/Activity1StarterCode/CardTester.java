package Activity1StarterCode;

/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card one = new Card("Queen", "Spade", 4);
		Card two = new Card("Fool", "Spade", 2);
		Card three = new Card("King", "Hearts", 7);
		
		one.toString();
		one.matches(three);
		two.toString();
		two.matches(two);
		three.toString();
		three.matches(one);
		
		
	}
}
