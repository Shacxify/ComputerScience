
public class TicTacToe {

	public static void main(String[] args) {
		char[][] board = new char[5][5];
		char sym = 1;
		//int num;
		
		for (int c = 0; c < board.length; c++) {
			if (c / 2 != 0)
				for (int i = 1; i <= board[c].length; i++) {
					if (i / 2 == 0){
						i = sym;
					} else {
						i = '|';
					}
			}
			
			System.out.println("");
		}
		
		
		for (int c = 0; c < board.length; c++) {
			for (int i = 0; i < board[c].length; i++) {
				System.out.print(board[c][i] + "");
			}
			System.out.println("");
		}
	}

}
