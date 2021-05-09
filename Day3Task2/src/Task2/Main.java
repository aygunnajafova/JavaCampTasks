package Task2;

public class Main {

	public static void main(String[] args) {
		Instructor instructor1 = new Instructor();
		instructor1.setId(1);
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demirog");
		instructor1.setCourseName("C#");
		instructor1.setCourseCount(15);

		Instructor instructor2 = new Instructor();
		instructor2.setId(1);
		instructor2.setFirstName("Murat");
		instructor2.setLastName("Coshkun");
		instructor2.setCourseName("Web Development");
		instructor2.setCourseCount(8);

		Instructor[] instructors = new Instructor[] { instructor1, instructor2 };

		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addMultiple(instructors);
		instructorManager.addCourseMultiply(instructors);

		Student student1 = new Student();
		student1.setId(1);
		student1.setFirstName("Aygun");
		student1.setLastName("Najafova");
		student1.setTaskName("Task-3");
		student1.setPoint(98);

		Student student2 = new Student();
		student2.setId(2);
		student2.setFirstName("Nargiz");
		student2.setLastName("Hasanli");
		student2.setTaskName("Task-2");
		student2.setPoint(92);

		Student[] students = new Student[] { student1, student2 };

		StudentManager studentManager = new StudentManager();
		studentManager.deleteMultiple(students);
		studentManager.showPointMultiply(students);

	}

}
