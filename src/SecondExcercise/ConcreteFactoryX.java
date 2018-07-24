package SecondExcercise;

public class ConcreteFactoryX implements AbstractFactory{
	public ProductAX createProductA(){
		return new ProductAX();
	}
	public ProductBX createProductB(){
		return new ProductBX();
	}
	

}
