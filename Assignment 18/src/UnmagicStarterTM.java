import java.util.*;

public class UnmagicStarterTM {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.print("Gimme a numbah: ");
		finderMN(input.nextInt());

	}
	
	//Counter
	public static void finderMN (int n) {
		int magicNumber = n;
		int i = 1;
		int isMN = 0;
		
		while (isMN < magicNumber) {
			isMN += i;
			i = i + 1;
		}
		
		i -= 1;
		
		System.out.println(magicNumber + " (" + "1" + " to " + i + ")");
	}
	


}
