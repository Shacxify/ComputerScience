import java.util.Scanner;
import java.util.Random;

/**
 * This class outlines a Volleyball or Racquetball simulation
 * depending on the String specified in the constructor.
 * 
 * The simulation is run when <code>runSim()</code> is called and 
 * utilizes the recursive method <code>PlayUntilWin()</code>
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VolleyRacquetSim
{
	/**
	 * Differentiates the two games.
	 */
	private boolean winByTwo;
	private double prob;
	private int numberOfSims;
	private String game;
	private int bWins, aWins;

	/**
	 * New <code>VolleyRacquetSim</code> instance
	 */ 
	public VolleyRacquetSim(String game)
	{
		/* initialize winByTwo */


	}


	public void runSim()
	{
		Scanner in = new Scanner(System.in);

		/* Get user input for probability and number of simulations */
		System.out.print("Please input probability: ");
		prob = in.nextDouble();
		System.out.print("Please input amount of simulations: ");
		numberOfSims = in.nextInt();

		/* Loop for the number of simulations specified. Call <code>playUntilWin()</code> and print results */
		for (int i = 0; i < numberOfSims; i++) {
			String totalWin = playUntilWin("A", "B", prob, 0, 0);
			System.out.println("Game #" + i + totalWin);
			if (totalWin == "A") {
				aWins++;
			} else {
				bWins++;
			}
		}
		System.out.println(aWins + "/" + bWins + " = " + (aWins/bWins));


	}

	public String playUntilWin(String server, String receiver, 
			double probWinVolley, int serverScore, int recScore)
	{	
        String winner = "";
        if(Math.random() < probWinVolley)
        {
            serverScore ++;
            winner = "A";
            
            if((serverScore >= 15 && serverScore >= recScore + 2 || !winByTwo))
            {
                winner= "A";

            }
            else if((recScore>= 15 && recScore >= serverScore + 2 || !winByTwo))
            {
                winner = "B";

            }
        }
        else
        {
            recScore++;
            winner = "B";
        }        	
        return winner;

	}
}
