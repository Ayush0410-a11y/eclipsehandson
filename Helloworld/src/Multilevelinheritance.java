class Animal{
	void eat() {
		System.out.println("the animal eat");
	}
}

class Dog extends Animal{
	void sleep() {
		System.out.println("the dog sleeps");
	}
}

class Babydog extends Dog{
	void bark() {
		System.out.println("the baby dog bark");
	}
}
public class Multilevelinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Babydog bd= new Babydog();
		bd.bark();
		bd.eat();
		bd.sleep();
	}

}
