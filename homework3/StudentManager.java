package homework3;

public class StudentManager extends UserManager{
	
	public void add(Student student) {
		System.out.println("Sisteme kay�t olundu : " + student.getFirstName() + " " + student.getLastName());
	}
	
	public void addCourse(Student student) {
		System.out.println("Kursa kay�t oldundu : " + student.getRegisteredcourse());
	}
	
}
