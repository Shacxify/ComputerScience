import java.util.*;

/**
 * Write a description of class numFind here.
 * 
 * @Cash Johnson  
 * @10/24/16
 */
public class numFind
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        
        int sum = 0;
        System.out.println("Enter letters and numbers: ");
        String userInput = input.nextLine();
        
        int length = userInput.length(); 
        for(int i = 0; i < length; i++)
        {
            //Get Char
            char x = userInput.charAt(i);
            //Check through and loop variables
            if(Character.isDigit(x))
            {
                String num = Character.toString(x);
                sum += Integer.parseInt(num);
            }
            
        }
        System.out.println(sum);
    }
}

