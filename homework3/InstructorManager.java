package homework3;

public class InstructorManager extends UserManager{
	
	public void add(Instructor instructor) {
		System.out.println("Sisteme kay�t olundu : " + instructor.getFirstName() + " " + instructor.getLastName());
	}
	
	public void addInfo(Instructor instructor) {
		System.out.println("Bilginiz sisteme y�klendi : " + instructor.getInfo());
	}

}
