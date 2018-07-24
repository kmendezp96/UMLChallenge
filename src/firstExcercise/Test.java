package firstExcercise;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Test {
	public static void main(String args[]){
		List<LineItem> items = new LinkedList<LineItem>(); 
		Order order = new Order (1, new Date(), OrderStatus.SHIPPED, "calle falsa 123",0, items);
		order.addItem(new LineItem(3,20000,new Product("45324543f","doritos","comida saludable")));
		order.addItem(new LineItem(30,30000,new Product("454T3TF","Zucaritas","cereal")));
		order.addItem(new LineItem(20,3000,new Product("FDFE43DWF4","Leche","bebida")));
		System.out.println(order.setTotal());
		
	}
	

}
