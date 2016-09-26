import java.util.Scanner;

public class Runner {

	private static Scanner input;

	public static void main(String[] args) {
		
		input = new Scanner (System.in);
		System.out.print("Please input the weight then dimensions of your package: ");
		int weight = input.nextInt();
		int dimension1 = input.nextInt();
		int dimension2 = input.nextInt();
		int dimension3 = input.nextInt();
		
		//Creating the package and looking through properties
		Package pack = new Package ();
		pack.Box(weight, dimension1, dimension2, dimension3); //Creating Box
		/*int longestDim =*/pack.longestDimension(); //Determining the longest unit
		int girth = pack.girthCalc(); //Determining the girth
		int size = pack.sizeCalc(); //Determining full package size
		String computerDetermination = pack.susDet(); //Determining if package is acceptable
		
		//Final Output
		System.out.println("Your package properties are: ");
		System.out.println("			  Girth: " + girth);
		System.out.println("			  Size:" + size);
		System.out.println("			  Weight: " + weight);
		System.out.println(""); //Break
		System.out.println(computerDetermination);
		
		
		
		
	}

}
