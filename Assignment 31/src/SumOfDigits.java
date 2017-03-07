import java.util.Scanner;
public class SumOfDigits
{

    public static void main(String[] args){
        System.out.println("Enter a number to receive the sum of its digits: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int sumOfDigs = 0;
        System.out.println("My sum of digits is: " + getSum(num,sumOfDigs));
    }
    
    public static int getSum(int num, int sumOfDigs){
        sumOfDigs += num % 10;
        num = num/10;
        if(num != 0){
            return getSum(num,sumOfDigs);
        }
        else{
            return sumOfDigs;
        }
    }
}
