import java.util.Scanner;

//Author: uosuɥoſ ɥsɐƆ 

public class Homework0 {
	public static void main(String [] args) {
		System.out.println("Hello!");
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please input a four digit number: ");
		double userInput = input.nextDouble(); /*Line Breaker1*/ System.out.println();
		
		//Finding thousandth place
		double thousP = userInput;
		int thousPint = (int)(thousP / 1000);
		int fullThous = (int)(thousPint * 1000);
		
		//Finding hundredth place
		double hundP = (userInput - fullThous);
		int hundPint = (int)(hundP / 100);
		int fullHund = (int)(hundPint * 100);
		
		//Finding tenth place
		double tenP = (userInput - fullThous) - fullHund;
		int tenPint = (int)(tenP / 10);
		int fullTen = (int)(tenPint * 10);
		
		//Finding the ones place
		double oneP = ((userInput - fullTen) - fullThous) - fullHund;
		int onePint = (int)(oneP / 1);
		int fullOne = (int)(onePint * 1); //Not used but follows pattern. 
		
		
		System.out.println("You put in: " + userInput); /*Line Breaker2*/ System.out.println();
		System.out.println("Thousandth Place: " + thousPint);
		System.out.println("Hundredth Place: " + hundPint);
		System.out.println("Tenth Place: " + tenPint);
		System.out.println("One Place: " + onePint); /*Line Breaker3*/ System.out.println();
		System.out.println("Output: " + thousPint + " " + hundPint + " " + tenPint + " " + onePint);
		
		input.close();
	}
}
