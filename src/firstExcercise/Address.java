package firstExcercise;

public class Address {
	private int id;
	private String lineOne;
	private String lineTwo;
	private String city;
	private String country;
	private boolean billingAdress;
	public Address(int id, String lineOne, String lineTwo, String city, String country, boolean billingAdress) {
		super();
		this.id = id;
		this.lineOne = lineOne;
		this.lineTwo = lineTwo;
		this.city = city;
		this.country = country;
		this.billingAdress = billingAdress;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getLineOne() {
		return lineOne;
	}
	public void setLineOne(String lineOne) {
		this.lineOne = lineOne;
	}
	
	public String getLineTwo() {
		return lineTwo;
	}
	public void setLineTwo(String lineTwo) {
		this.lineTwo = lineTwo;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public boolean isBillingAdress() {
		return billingAdress;
	}
	public void setBillingAdress(boolean billingAdress) {
		this.billingAdress = billingAdress;
	}
	
	public String getAddress(){
		return this.lineOne +" "+this.lineTwo+", "+this.city+ " ("+this.country+").";
	}

}
