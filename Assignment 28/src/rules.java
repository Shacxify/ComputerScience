import java.util.Scanner;

public class rules {
	public rules() {
		
	}
	
	public static char[][] board;
	public static boolean[][] checkedBoard;
	public static char turn = 'x';
	public static int symNum, turnNumber;
	public static boolean gameOver;
	public static String name1, name2, currentName;
	public static Scanner in;
	
	public String decideName (char sym) {
		if (sym == 'o') {
			return name1;
		} else {
			return name2;
		}
	}
	
	public void createBase() {
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
	public void printBoard() {
		for (int c = 0; c < board.length; c++) {
			for (int i = 0; i < board[c].length; i++) {
				System.out.print(board[c][i]);
			}
			System.out.println("");
		}
	}
	
	public void move(int choice) {
		if (turn == 'x') {
			turn = 'o';
		} else {
			turn = 'x';
		}
		
		for (int c = 0; c < board.length; c += 2) {
			for (int i = 0; i < board[c].length; i += 2) {
				if (Character.forDigit(choice, 10) == board[c][i]) {
					board[c][i] = turn;
					turnNumber++;
				}
			}
		}
		System.out.println("");
	}
	
	public boolean checkWin () {
		for (int c = 0; c < board.length; c += 2) {
			for (int i = 0; i < board[c].length; i += 2) {
				////Check horizontal line
				if (board[0][0] == board[0][2] && board[0][2] == board[0][4]) {
					return true;
				} else if (board[2][0] == board[2][2] && board[2][2] == board[2][4]){
					return true;
				} else if (board[4][0] == board[4][2] && board[4][2] == board[4][4]) {
					return true;
				}
				
				////Check diagonal line 
				else if (board[0][0] == board[2][2] && board[2][2] == board[4][4]) {
					return true;
				} else if (board[0][4] == board[2][2] && board[2][2] == board[4][0]) {
					return true;
				}
				
				////Check vertical lines
				else if (board[0][0] == board[2][0] && board[2][0] == board[4][0]){
					return true;
				} else if (board[0][2] == board[2][2] && board[2][2] == board[4][2]) {
					return true;
				} else if (board[0][4] == board[2][4] && board[2][4] == board[4][4]) {
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean tie () {
		if (turnNumber == 9) {
			return true;
		}
		return false;
	}
}
