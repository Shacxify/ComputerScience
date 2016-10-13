import java.util.Scanner;

public class ArithmeticCalculator {

	static Scanner input;
	
	public static void main(String[] args) {
		input = new Scanner (System.in);
		boolean running = true;
		double userSelect, n1, n2;
		
		
		
		while (running) {
			System.out.print("Enter (1) to perform addition, "
					+ "(2) for subtraction, "
					+ "(3) for division, "
					+ "(4) for multiplication, "
					+ "or (5) for exponent: ");
			userSelect = input.nextInt();
			System.out.println("Enter the two numbers: ");
			n1 = input.nextInt();
			n2 = input.nextInt();
			math math = new math(n1, n2);
			
			if (userSelect == 1) {
				System.out.println(math.add());
			} else if (userSelect == 2) {
				System.out.println(math.sub());
			} else if (userSelect == 3) {
				System.out.println(math.div());
			} else if (userSelect == 4) {
				System.out.println(math.mult());
			} else if (userSelect == 5) {
				System.out.println(math.exp());
			}
			
			System.out.print("Would you like to perform another calculation?");
			String answer = input.get();
			if (answer.equals("no")) {
				running = false;
			} 
		}
		
	}

}
