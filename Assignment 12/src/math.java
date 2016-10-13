
public class math {
	
	double n1, n2;
	double result;
	
	public math (double number1, double number2) {
		n1 = number1;
		n2 = number2;
	}
	
	public double add () {
		result = n1 + n2;
		return result;
	}
	
	public double sub () {
		result = n1 - n2;
		return result;
	}
	
	public double mult () {
		result = n1 * n2;
		return result;
	}
	
	public double div () {
		result = n1 / n2;
		return result;
	}
	
	public double exp () {
		result = Math.pow(n1, n2);
		return result;
	}
}
