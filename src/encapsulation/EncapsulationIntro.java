package encapsulation;

public class EncapsulationIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop l = new Laptop();
		l.setRam(8);
		l.setPrice(30000);
		System.out.println(l.getRam());
		System.out.println(l.getPrice());

	}
	
	 void doWork() {
		System.out.println("doing work is boring and shitty");
	}

}

class Laptop{
//	EncapsulationIntro obj1 = new EncapsulationIntro();
//	obj1.;
	private int ram;//set as a private variable to hide the data
	private int price;//We have set price as a private variable due to security reasons so that we cannot access them directly
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
