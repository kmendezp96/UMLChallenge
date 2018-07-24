
public class Customer {
	private int id;
	private String name;
	private int contact;
	private String userName;
	private String pasword;
	
	public Customer(int id, String name, int contact, String userName, String pasword) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
		this.userName = userName;
		this.pasword = pasword;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getPasword() {
		return pasword;
	}
	public void setPasword(String pasword) {
		this.pasword = pasword;
	}
	
}
