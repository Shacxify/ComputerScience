
public class functions {
	public int s, b, p;
	public char[][] createGraph;
	
	public functions (int balls, int slots) {
		s = slots;
		b = balls;	
	}
	
	public void printo () {
		System.out.print("o");
	}
	
	public void newGraph () {
		
		createGraph = new char[s][b];
		
		for (int i = 0; i < createGraph.length; i++) {
			for (int r = 0; r < createGraph[i].length; r++) {
				createGraph[i][r] = '|';
			}
			if (i == 0 || i == 2 || i == 4) {
				for (int l = 0; l < createGraph[i].length; l++) {
					createGraph[i][l] = '_';
				}	
			}
		}
		
		for (int j = 0; j < createGraph.length; j++) {
			for (int a = 0; a < createGraph[j].length; a++) {
				System.out.println(createGraph[j][a]);
			}
			
		}
	}
	
}
