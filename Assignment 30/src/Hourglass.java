import java.util.Scanner;
import java.io.File;
import java.io.IOException;

/**
 * This program finds the largest sum of all hourglasses in
 * a 6x6 grid of integers.
 * 
 * EXAMPLE
 * 
 * 1  3  2  1 1  1
 * 2  3  3 -4 5  5
 * 3 -2 11 12 3  3
 * 2  2  1  1 2  2 
 * 1  1  2  1 1 11 
 * 2  3 22 21 1  1 1
 * 
 * There are 16 hourglasses that follow the pattern below:
 * 
 * a b c
 * 	 d
 * e f g
 * 
 * So few from above (top left and bottom left) include:
 * 
 * 1 3 2
 *   3
 * 3 -2 11
 * 
 * 2 2 1
 *   1
 * 2 3 22
 * 
 * @author (your name) 
 * @version 1/31/2017
 */

public class Hourglass 
{
    static int[][] grid = new int[6][6];
    static float[] vals = new float[12];
    static int row = 0, col = 0;
    
    public static void main(String[] args) throws IOException 
    {
        readFile();
        largestHourglass();
    }
    
    // pre: none
    // post: prints value of largest hourglass in grid
    public static void largestHourglass()
    {
    	for (int j = 1; j < 13; j++) {
    		 addVal(j);
    	}
        
        
    }
    
    // pre: none
    // post: populates grid with values from text file
    public static void readFile() throws IOException
    {
        Scanner in = new Scanner(System.in);
        System.out.print("What is the name of the file? ");  //enter the full name (ex: "grid.txt")
        String fileName = in.next();
        
        int r = 0;
        int c = 0;
        Scanner inFile = new Scanner(new File(fileName));
        
        while(inFile.hasNext())  // stop parsing file when there are no more values
        {
            grid[r][c++] = inFile.nextInt();  // populate our 2D array with integers from file
            
            if(c > 5)
            {
                r++;
                c = 0;
            }
        }
    }
    
    public static void addVal (int i) {
    	float fullNumber = grid[0 + row][0 + i] + grid[0 + row][1 + i] + grid[0 + row][2 + i]
    										  + grid[1 + row][1 + i] +
    	 				   grid[2 + row][0 + i] + grid[2 + row][1 + i] + grid[2 + row][2 + i];
    	vals[i] = fullNumber;
    }
}