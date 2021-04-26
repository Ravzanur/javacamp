package homework2;

public class CourseManager {
	public void addtoCourse(Course course) {
		
		System.out.println( course.id + " numaralý " + course.name + " isimli kurs, kurslarým bölümüne eklendi." );
	}
	public void addtoEducator(Educator educator) {
		System.out.println("Eðitmen sisteme eklendi : " + educator.firstname + educator.lastname);
	}
}
