import java.util.*;
/**
 * Write a description of class gearsRunner here.
 * 
 * @author Cash Johnson
 * @version 11/22/16
 */
public class gearsRunner
{
    public static String gears;

    public static void main (String [] args) {
        while (input != "bye"){
            Scanner input = new Scanner (System.in);

            System.out.println("What gears are you throwing in?");
            gears = input.nextLine(); 
            revs();
        }
    }

    public static void revs () {
        for (int i = 0; i < gears.length(); i++) {
            //System.out.println("Turned!");
            if (i == (gears.length() - 2)) {
                System.out.println(gears.indexOf(i) + " " + gears.indexOf(i + 1));
            } /*else if (i == (gears.length() - 1)) {
            System.out.print(i);
            }*/
        }
    }
}

