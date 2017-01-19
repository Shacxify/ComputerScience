import java.util.*;
/**
 * Write a description of class deoxyribonucleicacid here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class quincux
{
	static Scanner input;
	static int balls, slots, path = 1;
	static Random rand;
	static functions quin;
	static int[] slotBalls; 
	
    public static void main (String [] args) {
    	input = new Scanner(System.in);
    	rand = new Random();
    	
    	
    	System.out.println("How many balls are put in?");
    	balls = input.nextInt(); //Assign the balls
    	
    	System.out.println("How many slots does the quincux have?");
    	slots = input.nextInt(); //Assign the slots
    	
    	quin = new functions(balls, slots);
    	
    	//Drop balls
    	slotBalls = new int[quin.s + 1];
    	for (int i = 1; i <= quin.b; i++) {
    		for (int j = 1; j < quin.s; j++) {
    			double chance = Math.random();
    			//System.out.println(chance);
    			if (path == 0) {
					path = 1;
				}
    			
    			//Left Side
    			if (chance <= .5) {
    				System.out.println("Left");
    			}
    			
    			//Right Side
    			if (chance > .5) {
    				System.out.println("Right");
    				path += 1;
    			}
    		}
    		slotBalls[path] += 1;
    		System.out.println("Ball #" + i + " fell into Slot #" + (path));
    		System.out.println("The path #" + path + " has " + slotBalls[path] + " ball(s)");
			path = 0;
			
    	}
    	for (int c = 1; c < slotBalls.length; c++) {
			System.out.print("\n Slot #" + c + " has " + slotBalls[c] + " ball(s)");
		}

    	quin.newGraph();
    }
}
