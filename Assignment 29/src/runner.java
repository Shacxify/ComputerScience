import java.util.*;

public class runner {
	public static Scanner in;
	
	public static void main(String[] args) {
		in = new Scanner(System.in);
		float a, b, c, d, e, f;
		
		System.out.println("Enter a, b, and c for the first equation:");
		a = in.nextFloat(); b = in.nextFloat(); c = in.nextFloat(); 
		System.out.println("Enter a, b, and c for the second equation:");
		d = in.nextFloat(); e = in.nextFloat(); f = in.nextFloat(); 		
		matrix mat = new matrix (a, b, c, d, e, f);
		
		mat.printMain();
		System.out.println("\n\n" + "is now..." + "\n");
		mat.invBoard();
		System.out.println("\n\n" + "w/ multiplication, it's..." + "\n");
		mat.multBoard();
		System.out.println("\n" + a + "x + " + b + "y = " + c);
		System.out.println(a + "x + " + b + "y = " + c);
		mat.finalSolutions();
	}

}
