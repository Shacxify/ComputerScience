import java.util.*;

/**
 * Write a description of class shapeRunner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class shapeRunner
{
    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Input size: ");
        int userInput = input.nextInt();
        shapeCreator shapeCreate = new shapeCreator();
        shapeCreate.makeShape(userInput);
        
        shapeCreate.clearLine();
        shapeCreate.rTriangle();
        shapeCreate.clearLine();
        shapeCreate.square();
        shapeCreate.clearLine();
        shapeCreate.iTriangle();
    }
}
