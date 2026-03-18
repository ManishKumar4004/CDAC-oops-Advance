package abstract1;

public class cat extends Animal{

	@Override
	public void sound() {
		System.out.println("Meow..Meow");
	}
	
	public static void main(String[] args) {
		cat c1 = new cat();
		c1.sound();
	}
    
}
