package firstExcercise;

import java.util.Date;

public class DebitCard extends PaymentMethod{
	private double number;
	private Date expDate;
	private Issuer issuer;
	public DebitCard(int id, double number, Date expDate, Issuer issuer) {
		super(id);
		this.number = number;
		this.expDate = expDate;
		this.issuer = issuer;
	}
	public double getNumber() {
		return number;
	}
	public void setNumber(double number) {
		this.number = number;
	}
	public Date getExpDate() {
		return expDate;
	}
	public void setExpDate(Date expDate) {
		this.expDate = expDate;
	}
	public Issuer getIssuer() {
		return issuer;
	}
	public void setIssuer(Issuer issuer) {
		this.issuer = issuer;
	}
	
	
	

}
