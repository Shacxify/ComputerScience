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
	static int balls, slots, path;
	static Random rand;
	static functions quin;
	
    public static void main (String [] args) {
    	input = new Scanner(System.in);
    	rand = new Random();
    	
    	
    	System.out.println("How many balls are put in?");
    	balls = input.nextInt(); //Assign the balls
    	
    	System.out.println("How many slots does the quincux have?");
    	slots = input.nextInt(); //Assign the slots
    	
    	quin = new functions(balls, slots);
    	
    	//Drop balls
    	for (int i = 1; i <= quin.b; i++) {
    		for (int j = 1; j <= quin.s; j++) {
    			double chance = Math.random();
    			//System.out.println(chance);
    			
    			//Left Side
    			if (chance <= .5) {
    				System.out.println("Left");
    				/*if (path == 0) {
    					path =+ 1;
    				}*/
    			}
    			
    			//Right Side
    			if (chance > .5) {
    				System.out.println("Right");
    				if (path == quin.s) {
    					path += 0;
    				} else {
    					path += 1;
    				}
    			}
    		}
    		System.out.println("Ball #" + i + " fell into Slot # " + (path + 1));
			path = 0;
    	}
    	
    	
    }
}
