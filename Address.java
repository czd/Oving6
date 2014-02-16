package oving6;

public class Address {
	
	private String street;
	private int houseNr;
	private int postCode;
	private String city;
	
	public Address(){
		street = "";
		houseNr = 0;
		postCode = 0000;
		city = "";
	}
	
	public Address(String street, int houseNr, int postCode, String city){
		this.street = street;
		this.houseNr = houseNr;
		this.postCode = postCode;
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getHouseNr() {
		return houseNr;
	}

	public void setHouseNr(int houseNr) {
		this.houseNr = houseNr;
	}

	public int getPostCode() {
		return postCode;
	}

	public void setPostCode(int postCode) {
		this.postCode = postCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	

}
