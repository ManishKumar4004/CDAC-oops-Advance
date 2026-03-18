package abstract1;


// Create cow class and extends Animal class
public class Cow extends Animal{

	@Override
	public void sound() {
		System.out.println("bhaaa...bhaaa...");
		
	}
	public static void main(String[] args) {
		Cow c = new Cow();
		c.sound();
	}
   
}
