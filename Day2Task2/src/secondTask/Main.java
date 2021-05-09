package secondTask;

public class Main {

	public static void main(String[] args) {
		Instructor instructor1 = new Instructor(1, "Engin", "Demirog", "Ankara");
		Instructor instructor2 = new Instructor(2, "Murat", "Coskun", "Istanbul");

		Instructor[] instructors = { instructor1, instructor2 };
		
		
		Category category1 = new Category(1, "C#");
		Category category2 = new Category(2, "Java");

		Category[] categories = { category1, category2 };

		
		for(Instructor instructor : instructors) {
			System.out.println(instructor.firstName);
		}
		
		for(Category category : categories) {
			System.out.println(category.name);
		}
		
		CourseManager courseManager = new CourseManager();
		courseManager.CourseAdd(category2);
	}

}
