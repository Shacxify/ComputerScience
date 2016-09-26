import java.util.Scanner;

/**
 * Write a description of class weekRunner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class weekRunner
{
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        
        //Input the current day
        System.out.println("Enter the day of the week by value (Sunday is 0, Monday is 1, ..., and Saturday is 6): ");
        int today = input.nextInt();
        
        //Input days elapsed since day
        System.out.println("Enter the days elapsed since today: ");
        int dayElap = input.nextInt();
        
        Days daysSetup = new Days();
        String name = daysSetup.getDayName(today);
        System.out.println("Today is: " + name);
        
    }
}
