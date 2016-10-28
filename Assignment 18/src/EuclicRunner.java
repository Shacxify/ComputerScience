import java.util.Scanner;

/**
 * Write a description of class EuclicRunner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EuclicRunner
{
    public static Scanner input;
    static int fInt = 0;  
    static int sInt = 0;

    public static void main (String [] args) {
        input = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        fInt = input.nextInt();
        System.out.print("Enter the second integer: ");
        sInt = input.nextInt();

        System.out.print(division(fInt, sInt));

    }

    public static int division (int f, int s) {
        int gcd = 0;
        int r = 1;
        while (r != 0) {
            if (f < s) {
                r = s % f;
            } else if (f > s) {
                r = f % s;
            }
            
            
        }
        return(r);
    }
}
