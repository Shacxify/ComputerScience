
public class Grid1 {

	public static void main(String[] args) {
		int[][] grid = new int[5][5];
		int num = 1;
		
		//Populate the 2-D array
		for (int r = 0; r < grid.length; r++) {
			for (int c = 0; c < grid[r].length; c++) {
				grid[r][c] = num;
				num++;
			}
		}
		
		//Print values in the 2-D array
		for (int r = 0; r < grid.length; r++) {
			for (int c = 0; c < grid[r].length; c++) {
				System.out.print(grid[r][c] + "\t");
			}
			System.out.println("");
		}
	}

}
