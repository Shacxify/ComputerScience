// Cash Johnson 🇲🇰
// 03162017

public class Person {
	private String name;
	private String number;
	private String email;
	
	public Person (String na, String num, String em) {
		name = na;
		number = num;
		email = em;
	}
	
	//Name is returned
	public String getName() {
		return name;
	}
	//Number is returned
	public String getNumber() {
		return number;
	}
	//Email is returned
	public String getEmail() {
		return email;
	}
	
	//Return true if comparison is alike
	public boolean equals(Person p) {
		boolean na = getName().equals(p.getName());
		boolean nu = getNumber().equals(p.getNumber());
		boolean em = getEmail().equals(p.getEmail());
		
		return na && nu && em;
	}
	
	@Override
	public String toString() {
		return name + 
				",\n" + number + 
				",\n" + email;
		
	}
}