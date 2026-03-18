package abstract1;

public class Dog extends Animal{

	@Override
	public void sound() {
		System.out.println("Bhaw..Bhaow");
	}
	
	
	public static void main(String[] args) {
		Dog d = new Dog();
		d.sound();
	}
}
