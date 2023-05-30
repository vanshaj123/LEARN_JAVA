package basics;

public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Audi a = new Audi();
		a.start();
		a.price = 30000;
		System.out.println(a.price);
	}

}

class Audi extends Car{
	void start() {
		System.out.println("Audi is starting");
	}
};

class BMW extends Car{
	void start() {
		System.out.println("BMW is starting");
	}
}

abstract class Car{//Its just a concept with no real implementation
	int price;
	abstract void start();//Abstract methods should have abstract classes not vice versa and no implementation
}
