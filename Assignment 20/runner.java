import java.util.*;

/**
 * Write a description of class runner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class runner
{
    public static void main (String[] args) {
        boolean running = true;
        Scanner input = new Scanner (System.in);
        int userInput;
        
        while (running) {
            System.out.print("What's your number?");
            userInput = input.nextInt();
            piEst(userInput);
            
        }
        
        
    }
    
    public static void piEst (int i) {
        double fullEq = 4 * 1;
        for (int l = 1; l < i; l++) {
            if (l % 2 == 0) {
                //fullEq =- 
            }
        }
    }
}
