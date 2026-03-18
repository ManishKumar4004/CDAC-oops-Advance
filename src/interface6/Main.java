package interface6;

// Main class 
public class Main {
    public static void createshape() {
    	
    	//Main Class uses Anonymous inner class to extends shape(class) and implements and Override draw method
    	shape s = new shape() {

			@Override
			void draw() {
				System.out.println("Anonymous class wil be execute...");
			}
    		
    	};
    	s.draw();
    }
    public static void main(String[] args) {
    	createshape();
    }
}
