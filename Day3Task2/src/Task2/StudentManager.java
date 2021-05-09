package Task2;

public class StudentManager extends UserManager {

	public void showPoint(Student student) {
		System.out.println(
				student.getFirstName() + "'s point for " + student.getTaskName() + " is " + student.getPoint());
	}

	public void showPointMultiply(Student[] students) {
		for (Student student : students) {
			System.out.println(
					student.getFirstName() + "'s point for " + student.getTaskName() + " is " + student.getPoint());
		}
	}

}
