
public class Check extends PaymentMethod{
	private int number;
	private int bankld;
	private String holder;
	public Check(int id, int number, int bankld, String holder) {
		super(id);
		this.number = number;
		this.bankld = bankld;
		this.holder = holder;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getBankld() {
		return bankld;
	}
	public void setBankld(int bankld) {
		this.bankld = bankld;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	

}
