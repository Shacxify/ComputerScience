import java.util.*;

public class Janken {
	public char userInput;
	public int computerRoll;
	public int userRoll;
	public int ranNum;
	
	public Random rand = new Random();
	
	public Janken () {

	}
	
	public void sasho(char x) {
		userInput = Character.toUpperCase(x);	
	}
	
	public String jankenpon() {
		
		//Rock - 1; Scissors - 2; Paper - 3;
		int computerRoll = rand.nextInt((3 - 1) + 1) + 1;
		
		if (Character.toString(userInput).equals("R")) {
			userRoll = 1;
		} else if (Character.toString(userInput).equals("S")) {
			userRoll = 2;
		} else if (Character.toString(userInput).equals("P")) {
			userRoll = 3;
		}
		
		if (userRoll == 1 && computerRoll == 2) {
			return "Computer chose Scissors. Rock smashes Scissors.";
		} else if (userRoll == 2 && computerRoll == 3) {
			return "Computer chose Paper. Scissors slices Paper.";
		} else if (userRoll == 3 && computerRoll == 1) {
			return "Computer chose Rock. Paper covers Rock.";
		} else {
			return "You tied"; 
		} 
	}
	
}
