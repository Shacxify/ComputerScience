/* 
  
  e88~-_       e      ,d88~~\ 888   |
 d888   \     d8b     8888    888___|
 8888        /Y88b    `Y88b   888   |
 8888       /  Y88b    `Y88b, 888   |
 Y888   /  /____Y88b     8888 888   |
  "88_-~  /      Y88b \__88P' 888   |
  
 */

import java.util.*;

public class runner
{
    

    public static Scanner input;

    

    public static void main(String[] args){
        input = new Scanner(System.in);
        boolean running = true;
        int fullNum = 0;
        
        while (running) {
            System.out.println("\nWhat food would you like to eat?");
        
            String userInput = input.nextLine();
            
            for (int i = 0; i < userInput.length(); i++) {
                
                
                if (userInput.equals("I'm full")) {
                	running = false;
                } else if (fullNum % 5 == 0 && fullNum != 0) {
                    System.out.print("Burp. ");
                } else {
                	System.out.print("Nom ");
                }
                fullNum++;
            }
        }
        
    }

}