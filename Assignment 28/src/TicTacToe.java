import java.util.*;

public class TicTacToe {
	
	public static char[][] board;
	public static char turn = 'x';
	public static int symNum;
	public static boolean gameOver;
	public static String name1, name2;
	public static Scanner in;
	
	
	
	//Create the board
	public static void createBase() {
		for (int c = 0; c < board.length; c++) {
			if (c == 0 || c == 2 || c == 4) {
				for (int i = 0; i < board[c].length; i++) {
					if (i % 2 != 0){
						board[c][i] = '|';
					} else {
						board[c][i] = Character.forDigit(symNum, 10);
						symNum++;
					}
				}
			} else {
				for (int i = 0; i < board[c].length; i++) {
					board[c][i] = '-';
				}
			}
		}
	}
	
	//Print the current board
	public static void printBoard() {
		for (int c = 0; c < board.length; c++) {
			for (int i = 0; i < board[c].length; i++) {
				System.out.print(board[c][i]);
			}
			System.out.println("");
		}
	}
	
	public static void play(String p1, String p2){
		while (!gameOver) {
			
		}
	}
	
	public static void move(int choice) {
		if (turn == 'x') {
			turn = 'o';
		} else {
			turn = 'x';
		}
		
		for (int c = 0; c < board.length; c += 2) {
			for (int i = 0; i < board[c].length; i += 2) {
				if (Character.forDigit(choice, 10) == board[c][i]) {
					board[c][i] = turn;
				}
			}
		}
		System.out.println("");
	}
	
	
	public static void main(String[] args) {
		board = new char[5][5];
		symNum = 1;
		gameOver = false;
		in = new Scanner(System.in);
		
		System.out.println("Tic-Tac-Toe");
		System.out.println("");
		System.out.print("What's player1's name? ");
		name1 = in.nextLine();
		System.out.print("What's player2's name? ");
		name2 = in.nextLine();
		System.out.println("\t");
		
		
		
		//Setup board
		createBase();

		//Board Print
		printBoard();
		
		
		//Game Start
		
		
		while (!gameOver) {
			System.out.print("What tile you want? ");
			int tChoice = in.nextInt();
			move(tChoice);
			printBoard();
		}
		
		
		 
		
		
	}

}
