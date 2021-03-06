import java.util.*;

public class TicTacToe {
	
	public static Scanner in;
	public static rules qi;
	
	//PROGRAM BEGINS	
	public static void main(String[] args) {
		qi = new rules();
		qi.board = new char[5][5];
		qi.symNum = 1;
		qi.gameOver = false;
		in = new Scanner(System.in);
		
		System.out.println("Tic-Tac-Toe");
		System.out.println("");
		System.out.print("What's player1's name? ('x') ");
		qi.name1 = in.nextLine();
		System.out.print("What's player2's name? ('o') ");
		qi.name2 = in.nextLine();
		System.out.println("\t");
		
		
		
		//Setup board
		qi.createBase();

		//Board Print
		qi.printBoard();
		
		
		//Game Start
		while (!qi.gameOver) {
			System.out.print(qi.decideName(qi.turn) + ", What tile you want? ");
			int tChoice = in.nextInt();
			qi.move(tChoice);
			qi.printBoard();
			if(qi.tie()) {
				qi.gameOver = true;
				System.out.println("\n" + "Look like a tie.");
				
			}
			
			if (qi.checkWin() && qi.turn == 'o') {
				System.out.println("\n" + qi.decideName('x') + " Wins");
				qi.gameOver = true;
			} else if (qi.checkWin() && qi.turn == 'x') {
				System.out.println("\n" + qi.decideName('o') + " Wins");
				qi.gameOver = true;
			}
		}
		
	}

}
