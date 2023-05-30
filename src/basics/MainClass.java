package basics;

import encapsulation.EncapsulationIntro;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
//		p1.age = 24;
//		p1.name = "Vanshaj";
		System.out.println(p1.name + " " + p1.age);
		p1.eat();
		p1.eat(3);
		Person p2 = new Person(21,"VR");
		System.out.println(Person.count);
		//System.out.println();
		
		Developer d = new Developer();
		System.out.println(d.age);
		d.eat();
		EncapsulationIntro obj = new EncapsulationIntro();
		//obj.doWork();
		
	}
	
}	


	
class Person{
	String name;
	int age;
	static int count;
	public Person() {
		count++;
		System.out.println("constructor called");
		this.age = 21;
		this.name = "VR";
	}
	
	public Person(int age,String name) {
		this();//calling default constructor Person()
		this.age = age;//this -> represents Person's class properties, here in this case, property is age
		this.name = name;
	}
	
	void eat() {
		System.out.println(name + " " + "is eating");
	}
	
	void eat(int n) {
		System.out.println(name + " " + "is eating " + n + " dishes");//Polymorphism - Many forms, basically compile time polymorphism
	}
}	

class Developer extends Person{
	public Developer() {
		super(23,"MNM");//calls the constructor of Parent class
//		this.age = 29;
//		this.name = "VAR is Disgrace";
		//System.out.println(age);
	}
	
	void eat() {
		System.out.println("Developer "+ name + " " + "is eating");//Run time polymorphism
	}
}


