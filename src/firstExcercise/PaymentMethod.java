package firstExcercise;

public abstract class PaymentMethod {
	private int id;

	public PaymentMethod(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public abstract void authorize();

}
