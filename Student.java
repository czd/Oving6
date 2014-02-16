package oving6;

public class Student extends Person {
	
	private String major;
	private int grade;
	
	public Student() {
		super();
		major = "";
		grade = 0;
	}
	
	public Student(String givenName, String surname, String street,
			int houseNr, int postCode, String city, String major, int grade) {
		super(givenName, surname, street, houseNr, postCode, city);
		this.major = major;
		this.grade = grade;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	@Override public String toString() {
		return super.toString() + "\n" + major + " " + grade;
	}

}
