package abstract2;

public class Refrigerator extends Applience{
       public Refrigerator(String a,String b) {
    	   super(a,b);
       }

	   @Override
	   public void turnOn() {
		System.out.println("Refrigerator Turn On...");
	   }
	   
	   
}
