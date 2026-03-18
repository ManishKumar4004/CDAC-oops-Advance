package abstract2;

// Abstract class
public abstract class Applience {

   // Encapsulate instance variable
   private String Brand;
   private String Powerconsuption;
   
   // constructor 
   public Applience(String a,String b) {
	   Brand = a;
	   Powerconsuption = b;
	   System.out.println("Brand:"+a+" \nPowerconsuption:"+b);
   }
   
   // Abstract method
   public abstract void turnOn();
}
