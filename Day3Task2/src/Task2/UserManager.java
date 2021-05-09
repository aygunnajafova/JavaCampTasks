package Task2;

public class UserManager {

	public void add(User user) {
		System.out.println("user is added : " + user.getFirstName() + " " + user.getLastName());
	}

	public void delete(User user) {
		System.out.println("user is deleted : " + user.getFirstName() + " " + user.getLastName());
	}

	public void addMultiple(User[] users) {
		for (User user : users) {
			add(user);
		}
	}

	public void deleteMultiple(User[] users) {
		for (User user : users) {
			delete(user);
		}
	}

}
