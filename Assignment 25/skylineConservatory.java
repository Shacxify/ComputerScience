
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
        //locker[2] = true;
        if (locker[2] != false) {
            System.out.println("It works!");
        } else /*if (locker[3] == true)*/ {
            System.out.println("It doesn't work");
        }
        
        for (int i = 0; i <= 100; i++) {
            student(i);
        }
    }
    
    public static void student (int n) {
        locker[n] =! locker[n];
    } 
}   
