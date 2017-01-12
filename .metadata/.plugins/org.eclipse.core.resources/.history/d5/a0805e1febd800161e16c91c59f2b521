import java.util.*;
/**
 * Write a description of class deoxyribonucleicacid here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class deoxyribonucleicacid
{
    public static Scanner input = new Scanner(System.in);
    public static char[] DNA;
    public static String userInput;

    public static void main (String [] args) {
        System.out.print("Tell me your DNA: ");
        userInput = input.nextLine();
        setUpDNA(userInput);
        System.out.println(DNA[1]);

    }

    public static void setUpDNA(String in) {
        DNA = new char[in.length()];
        for (int i = 0; i < in.length(); i ++) {
            DNA[i] = in.charAt(i);
        }
    }
    
    public static void reverseDNA(char[] DNA) {
        for (int i = 0; i < DNA.length; i++) {
            if (Character.toString(DNA[i]) == "A") {
                DNA[i] = "T";
            } 
            
            if (DNA[i].toString == "T") {
                DNA[i] = "A";
            }
            
            if (DNA[i].toString == "C") {
                DNA[i] = "G";
            }
            
            if (DNA[i].toString == "G") {
                DNA[i] = "C";
            }
        }
    }
    
}
