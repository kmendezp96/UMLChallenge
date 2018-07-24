
import java.util.LinkedList;
import java.util.List;

public class ShoppingCart {
	private List<LineItem> items;

	public ShoppingCart() {
		super();
		this.items = new LinkedList <LineItem>();
		
	}
	public ShoppingCart(List<LineItem> items) {
		super();
		this.items = items;	
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
	
	public void CleanCart(){
		this.items = new LinkedList<LineItem>();
		
	}
	
	
	

}
