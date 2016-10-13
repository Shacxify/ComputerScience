import java.util.*;

//       ,gggg,             ,ggg,        ,gg,   ,ggg,        gg 
//     ,88"""Y8b,          dP""8I       i8""8i dP""Y8b       88 
//    d8"     `Y8         dP   88       `8,,8' Yb, `88       88 
//   d8'   8b  d8        dP    88        `88'   `"  88       88 
//  ,8I    "Y88P'       ,8'    88        dP"8,      88aaaaaaa88 
//  I8'                 d88888888       dP' `8a     88"""""""88 
//  d8            __   ,8"     88      dP'   `Yb    88       88 
//  Y8,          dP"  ,8P      Y8  _ ,dP'     I8    88       88 
//  `Yba,,_____, Yb,_,dP       `8b,"888,,____,dP    88       Y8,
//    `"Y8888888  "Y8P"         `Y8a8P"Y88888P"     88       `Y8
                                                       

//Created by Cash
public class CalculatorRunner {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner (System.in);
		boolean running = true;
		
		
		double largestNum = 0;
		double lowestNum = 0;
		int numInputs = -1;
		
		double fullEquation = 0;
		double average = Double.NaN;

		
		//Update Loop
		while (running) {
			System.out.println("Enter a number (type 'stop' to stop): ");
			
			String rawUserInput = input.nextLine();
			double userInput = Double.NaN;
			numInputs++;
			

			average = fullEquation / numInputs;
			
			//Check to see if thew user has typed "Stop"
			//If not, turn the user input into a double, renaming it to: "userInput"
			if (!rawUserInput.equals("stop")) {
				userInput = Double.parseDouble(rawUserInput);
				fullEquation += userInput;
				//System.out.print(fullEquation + " & " + numInputs);
				
				//Set the largest number and the lowest number
				if (userInput > largestNum) {
					largestNum = userInput;
					lowestNum = largestNum;
				} 
				
				if (userInput < lowestNum) {
					lowestNum = userInput;
				}
				
			} else {
				running = false; 
				System.out.println("You called for a stop! " + "\n" 
									+ "The highest number is " + largestNum + "\n"
									+ "The lowest number is " + lowestNum + "\n"
									+ "You typed in a total of : " + numInputs + " numbers." + "\n"
									+ "The average is: " + average);
			}
			
			

			
			
		}
		
	}

}
