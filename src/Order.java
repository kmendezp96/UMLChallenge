import java.util.List;

public class Order {
	private int id;
	private String DateTime;
	private OrderStatus status;
	private String shippingAddress;
	private double total;
	private List<LineItem> items;
	public Order(int id, String dateTime, OrderStatus status, String shippingAddress, double total,
			List<LineItem> items) {
		super();
		this.id = id;
		DateTime = dateTime;
		this.status = status;
		this.shippingAddress = shippingAddress;
		this.total = total;
		this.items = items;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDateTime() {
		return DateTime;
	}
	public void setDateTime(String dateTime) {
		DateTime = dateTime;
	}
	public OrderStatus getStatus() {
		return status;
	}
	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	public String getShippingAddress() {
		return shippingAddress;
	}
	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public List<LineItem> getItems() {
		return items;
	}
	public void setItems(List<LineItem> items) {
		this.items = items;
	}
	
	public void addItem(LineItem i){
		this.items.add(i);	
	}
	
	public double setTotal(){
		for (int i=0;i<this.items.size();i++){
			this.total = this.total + this.items.get(i).getPrice();		
		}
		return this.total;
	}
}
