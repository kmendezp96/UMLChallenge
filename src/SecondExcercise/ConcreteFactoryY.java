package SecondExcercise;


public class ConcreteFactoryY implements AbstractFactory{
	public ProductAY createProductA(){
		return new ProductAY();
	}
	public ProductBY createProductB(){
		return new ProductBY();
	}
	

}