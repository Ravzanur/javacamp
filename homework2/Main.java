package homework2;

public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course( 1, "JAVA + REACT" , "Engin Demirog" , "Ücretsiz"  );
		Course course2 = new Course( 2, "C# + ANGULAR" , "Engin Demirog" , "Ücretsiz"  );
		Course course3 = new Course( 3, "TEMEL KURS" , "Engin Demirog" , "Ücretsiz"  );
		
		Course[] courses = {course1, course2, course3};
		
		for (Course course : courses) {
			System.out.println(course.id);
			System.out.println(course.name);
			System.out.println(course.teacher);
			System.out.println(course.price);
			System.out.println("-----------------");
			
		}
		
		CourseManager courseManager = new CourseManager();
		courseManager.addtoCourse(course1);
		courseManager.addtoCourse(course2);
		courseManager.addtoCourse(course3);
		
		Educator educator1 = new Educator("Engin", "Demirog", "MCT,PMP,ITIL");
		
		courseManager.addtoEducator(educator1);
	}

}
