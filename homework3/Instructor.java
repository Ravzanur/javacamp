package homework3;

public class Instructor extends User {
	private String firstName;
	private String lastName;
	private String info;
	
	public Instructor() {
		
	}

	public Instructor(String firstName,String lastName, String info) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.info = info;
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
	
	
}
