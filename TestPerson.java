package oving6;

import java.util.ArrayList;

public class TestPerson {

	public static void main(String[] args) {
		Person one = new Person("Abc", "KC", "Sydvegen", 123, 5678, "Townsville");
		Student two = new Student("Def", "KC", "Nordvegen", 154, 2344, "Tomorrowtown", "Arts", 2004);
		
		ArrayList<Person> personer = new ArrayList<>();
		
		personer.add(one);
		personer.add(two);
		
		Person.printAll(personer);
	}

}
