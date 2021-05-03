package homework3;

public class Student extends User{
	private String firstName;
	private String lastName;
	private String registeredcourse;
	
	public Student () {
		
	}
	
	public Student(int id, String mail, String firstName, String lastName, String registeredcourse) {
		super(id,mail);
		this.firstName = firstName;
		this.lastName = lastName;
		this.registeredcourse = registeredcourse;
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

	public String getRegisteredcourse() {
		return registeredcourse;
	}

	public void setRegisteredcourse(String registeredcourse) {
		this.registeredcourse = registeredcourse;
	}

	
	
	
	
	
	
}
