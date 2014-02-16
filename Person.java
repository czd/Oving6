package oving6;

public class Person {
	
	private String givenName;
	private String surname;
	private Address address;
	
	public Person(){
		givenName = "";
		surname = "";
		address = new Address();
	}
	
	public Person(String givenName, String surname, Address address){
		this.givenName = givenName;
		this.surname = surname;
		this.address = address;
	}
	
	public Person(String givenName, String surname,
			String street, int houseNr, int postCode,
			String city){
		this.givenName = givenName;
		this.surname = surname;
		address = new Address(street, houseNr, postCode, city);
	}

	public String getGivenName() {
		return givenName;
	}

	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
