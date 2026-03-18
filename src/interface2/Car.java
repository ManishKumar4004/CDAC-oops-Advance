package interface2;

public class Car implements Vehicle{
	
	@Override
    public void startEngine() {
	      System.out.println(" CarEngine started");
   }
	
	public static void main(String[] args) {
		Car c = new Car();
		c.startEngine();
	}
}
