public class matrix {
	
	public static float a, b, c, d, e, f;
	public static float[][] mainMatrix = new float[2][2], invMatrix = new float[2][2], 
						  multMatrix = new float[2][2];
	public static float[] multiMatrix = new float[2];
	
	public matrix (float fA, float fB, float fC, float sA, float sB, float sC) {
		a = fA; b=fB; c=fC; d=sA; e=sB; f=sC;
		mainMatrix = new float[2][2];
		multiMatrix = new float[2];
		mainMatrix[0][0] = a; mainMatrix[0][1] = b; multiMatrix[0] = c; 
		mainMatrix[1][0] = d; mainMatrix[1][1] = e; multiMatrix[1] = f;
		
	}

	//Print board as raw input
	public void printMain() {
		System.out.print(mainMatrix[0][0] + " " + mainMatrix[0][1] +
				  "\n" + mainMatrix[1][0] + " " + mainMatrix[1][1]);
	}
	
	//Inversing the variables
	public void invBoard() {
		invMatrix[0][0] = e; invMatrix[0][1] = d; 
		invMatrix[1][0] = b; invMatrix[1][1] = a;
		System.out.print(invMatrix[0][0] + " " + invMatrix[0][1] +
				  "\n" + invMatrix[1][0] + " " + invMatrix[1][1]);
	}
	
	//Multiply the board by the allNum (1/(a*c)-(b*d))
	public void multBoard() {
		float allNum = (1 / ((a * d) - (b * c)));
		System.out.println("The allNum being: " + allNum);
		multMatrix[0][0] = (allNum * e); multMatrix[0][1] = (allNum * d); 
		multMatrix[1][0] = (allNum * b); multMatrix[1][1] = (allNum * a);
		System.out.print(multMatrix[0][0] + " " + multMatrix[0][1] +
				  "\n" + multMatrix[1][0] + " " + multMatrix[1][1]);
	}
	
	//Create Solution
	public void finalSolutions() {
		float sol1 = (multMatrix[0][0] * multiMatrix[0]) + (multMatrix[0][1] * multiMatrix[1]);
		float sol2 = (multMatrix[1][0] * multiMatrix[0]) + (multMatrix[1][1] * multiMatrix[1]);
		
		System.out.println("x: " + sol1);
		System.out.println("y: " + sol2);
	}
}
