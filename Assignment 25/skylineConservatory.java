
/**
 * Write a description of class collegeStateUniversity here.
 *
 * @author Cash
 * @version 12/8/16
 */
public class skylineConservatory
{
	public static boolean[] locker = new boolean[100];

	public static void main (String [] args) {
		System.out.println("Calculating.");
		for (int i = 0; i <= 100; i++) {
			for (int l = 0; l <= 100; l++) {
				student(i, l);
			}
		}
		
		for (int n = 0; n <= 100; n++) {
			if (locker[n] == true) {
				System.out.println("Locker #" + n + " is open.");
			}
		}
	}

	public static void student (int n, int currentNum) {
		if (n % currentNum == 0) {
			locker[n] =! locker[n];
		}
	}
}
