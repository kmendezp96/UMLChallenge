
public class CreditCard extends PaymentMethod {
	private double number;
	private String expDate;
	private int maxInstallements;
	private Issuer issuer;
	
	public CreditCard(int id, double number, String expDate, int maxInstallements, Issuer issuer) {
		super(id);
		this.number = number;
		this.expDate = expDate;
		this.maxInstallements = maxInstallements;
		this.issuer = issuer;
	}

	public double getNumber() {
		return number;
	}

	public void setNumber(double number) {
		this.number = number;
	}

	public String getExpDate() {
		return expDate;
	}

	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}

	public int getMaxInstallements() {
		return maxInstallements;
	}

	public void setMaxInstallements(int maxInstallements) {
		this.maxInstallements = maxInstallements;
	}

	public Issuer getIssuer() {
		return issuer;
	}

	public void setIssuer(Issuer issuer) {
		this.issuer = issuer;
	}
	
	
	
}
