package gun2odev;

public class CourseManager {
	public void addCourse(Course course) {
		System.out.println("Yeni Kurs Eklendi -> "+course.name);
	}
	public void deleteCourse(Course course) {
		System.out.println("Kurs Silindi ->"+course.name);

	}
}
