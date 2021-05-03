package homework3;

public class Main {

	public static void main(String[] args) {
		
		
		Student student1 = new Student(1,"ravza@gmail.com","Ravza","Cantürk","java");
		Student student2 = new Student();
		student2.setId(2);
		student2.setEmail("ayse@gmail.com");
		student2.setFirstName("Ayşe");
		student2.setLastName("Yılmaz");
		student2.setRegisteredcourse("C#");
		
		Instructor instructor1 = new Instructor();
		instructor1.setId(1000);
		instructor1.setEmail("engin@gmail.com");
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demiroğ");
		instructor1.setInfo("MCT,PMP,ITIL");
		
		
		UserManager userManager = new UserManager();
		userManager.add(student1);
		userManager.add(instructor1);

		StudentManager studentManager = new StudentManager();
		studentManager.add(student2);
		studentManager.addCourse(student2);
	
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor1);
		instructorManager.addInfo(instructor1);

	
	}

}
