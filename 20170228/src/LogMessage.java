
public class LogMessage 
{
	private String machineID;
	private String description;
	private static String input;
	
	public LogMessage (String message) {
		input = message;
		/*for (int i = 0; i < message.length(); i++) {
			
		}*/
	}
	
	public boolean containsWords (String keyword) {
		return false;
	}
	
	public String getMachineId () {
		//for ()
		return "";
	}
	
	public String getDescription () {
		return "";
	}
	
	public static void main(String[] args) {
		;
		System.out.println(input.indexOf(':'));
	}
	
}