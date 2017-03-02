
public class RandomStringChooser {
	public String[] givenSent;
	public int counter = -1;
	
	
	//HOW CAN THIS CONTRUSTOR BE PRIVATE??
	public RandomStringChooser (String[] in) {
		givenSent = in;
	}
	
	public String getNext () {
		counter++;
		if (counter < givenSent.length) {
			return givenSent[counter];
		} else {
			return "NONE";
		}
	}
}

/*class RandomLetterChooser extends RandomStringChooser {
	public static String givenString;
	public int counter = -1;
	
	public RandomLetterChooser (String[] str) {
		super(str);
		givenString = str;
	}
	
	public static String[] getSingleLetters() {
		for (int j = 0; j < givenString.length(); j++) {
		
		}
	}*/

