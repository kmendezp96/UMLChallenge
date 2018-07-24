package SecondExcercise;

public class Client {
	ConcreteFactoryX FactoryX = new ConcreteFactoryX();
	ConcreteFactoryY FactoryY = new ConcreteFactoryY();
	ProductAX productAX = FactoryX.createProductA();
	ProductBX productBX = FactoryX.createProductB();
	ProductAY productAY = FactoryY.createProductA();
	ProductBY productBY = FactoryY.createProductB();
	
	public void UseProductAX(){
		System.out.println(productAX.productAWork());
	}
	public void UseProductBX(){
		System.out.println(productBX.productBWork());
	}
	public void UseProductAY(){
		System.out.println(productAY.productAWork());
	}
	public void UseProductBY(){
		System.out.println(productBY.productBWork());
	}
	public static void main (String [ ] args) {
		Client client = new Client();
		client.UseProductAX();
		client.UseProductBX();
		client.UseProductAY();
		client.UseProductBY();
	}	

}
