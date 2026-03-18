package abstract1;

// Create Dog class and extends Animal class
public class Dog extends Animal{

//  Override Sound method
	@Override
	public void sound() {
		System.out.println("Bhaw..Bhaow");
	}
	
	
	public static void main(String[] args) {
		Dog d = new Dog();
		
		// Method call 
		d.sound();
	}
}
