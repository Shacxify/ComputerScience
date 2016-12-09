import java.util.*;
/**
 * Write a description of class runner here.
 * 
 * @Cash Johnson 
 * @version 10/29/16
 */
public class sortDice
{
    public static Scanner input = new Scanner(System.in);
    public static Random rando = new Random();
    public static int num1, num2, num3, num4, num5, num6;
    public static void main(String[] args){

        System.out.println("How many rolls? ");
        int rolls = input.nextInt();
        int[] dice = {0, 1, 2, 3, 4, 5};
        //int num1, num2, num3, num4, num5, num6;
        sorter(rolls);
        System.out.println("1: " + num1);
        System.out.println("2: " + num2);
        System.out.println("3: " + num3);
        System.out.println("4: " + num4);
        System.out.println("5: " + num5);
        System.out.println("6: " + num6);
    }

    public static void sorter (int r) {
        for(int i = 0; i < r; i++){
            int choice = rando.nextInt(6) + 1;
            if(choice == 1){
                num1++;
            } else if(choice == 2){
                num2++;
            } else if(choice == 3){
                num3++;
            } else if(choice == 4){
                num4++;
            } else if(choice == 5){
                num5++;
            } else if(choice == 6){
                num6++;
            }
        }
    }
    
    
}

