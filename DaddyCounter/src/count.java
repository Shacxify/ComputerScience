import java.util.*;

public class count {
	public static int daddies = 0;
	public static Scanner in;
	public static int answer = 1;
	
	public static void main(String[] args) {
		in = new Scanner(System.in);
		while (answer != 0) {
			System.out.println("Did she say 'Daddy'?");
			answer = in.nextInt();
			daddies += answer;
		}
		System.out.println("Emily Summers said daddy a total of " + daddies + " times.");

	}
}
