package Task2;

public class InstructorManager extends UserManager {

	public void addCourse(Instructor instructor) {
		System.out.println(instructor.getCourseName() + " course is added for " + instructor.getFirstName() + " "
				+ instructor.getLastName());
	}

	public void deleteCourse(Instructor instructor) {
		System.out.println(instructor.getCourseName() + " course is deleted for " + instructor.getFirstName() + " "
				+ instructor.getLastName());
	}

	public void showCourseCount(Instructor instructor) {
		System.out.println(
				instructor.getFirstName() + " " + instructor.getLastName() + " have " + instructor.getCourseCount());
	}

	public void addCourseMultiply(Instructor[] instructors) {
		for (Instructor instructor : instructors) {
			System.out.println(instructor.getCourseName() + " course is added for " + instructor.getFirstName() + " "
					+ instructor.getLastName());
		}
	}

	public void deleteCourseMultiply(Instructor[] instructors) {
		for (Instructor instructor : instructors) {
			System.out.println(instructor.getCourseName() + " course is deleted for " + instructor.getFirstName() + " "
					+ instructor.getLastName());
		}
	}

	public void showCourseCountMultiply(Instructor[] instructors) {
		for (Instructor instructor : instructors) {
			System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " have "
					+ instructor.getCourseCount());
		}
	}
}
