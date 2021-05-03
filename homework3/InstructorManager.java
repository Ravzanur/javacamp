package homework3;

public class InstructorManager extends UserManager{
	
	public void add(Instructor instructor) {
		System.out.println("Sisteme kayýt olundu : " + instructor.getFirstName() + " " + instructor.getLastName());
	}
	
	public void addInfo(Instructor instructor) {
		System.out.println("Bilginiz sisteme yüklendi : " + instructor.getInfo());
	}

}
