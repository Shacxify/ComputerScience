import java.util.Scanner;

/**
 * Write a description of class repeatEndRunner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class repeatEndRunner
{
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input a string and an integer: ");
        String userWord = input.nextLine();
        int userNum = input.nextInt();
        
        repeater(userWord, userNum);

        
    }

    public static void repeater (String uw, int n) {;
        
        for (int i = n; i < uw.length(); i++) {
            System.out.println(uw.substring(n));
        }
    }
}

