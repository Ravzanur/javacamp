package homework2;

public class CourseManager {
	public void addtoCourse(Course course) {
		
		System.out.println( course.id + " numaral� " + course.name + " isimli kurs, kurslar�m b�l�m�ne eklendi." );
	}
	public void addtoEducator(Educator educator) {
		System.out.println("E�itmen sisteme eklendi : " + educator.firstname + educator.lastname);
	}
}
