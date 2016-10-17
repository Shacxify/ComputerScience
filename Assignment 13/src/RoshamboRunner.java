import java.util.*;


public class RoshamboRunner {
	
	public static Scanner input = new Scanner (System.in);
	public int gameNum;
	public char userChoice;
	public static Janken jank = new Janken();
	//public boolean running;

	public static void main(String[] args) {
		
		
		
		System.out.println("Welcome to Rock-Paper-Scissors!");
		System.out.print("How many games do you want to play? ");
		
		int gameNum = input.nextInt();
		
		
		for (int i = 0; i < gameNum; i++) {
			System.out.print("Rock, Paper, or Scissors? ");
			char userChoice = input.next().charAt(0);
			jank.sasho(userChoice);
			String finale = jank.jankenpon();
			System.out.println(finale + "\n");
		}
		

	}

}
