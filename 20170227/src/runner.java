
public class runner {
	public static String[] theWords = { "wheels", "on", "the", "bus" };
	
	public static void main(String[] args) {
		RandomStringChooser sChooser = new RandomStringChooser(theWords);
		for (int i = 0; i < 6; i++){
			System.out.println(sChooser.getNext() + "");
		}
	}
}
