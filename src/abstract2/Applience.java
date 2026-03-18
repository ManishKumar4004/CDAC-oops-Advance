package abstract2;

public abstract class Applience {
   private String Brand;
   private String Powerconsuption;
   
   public Applience(String a,String b) {
	   Brand = a;
	   Powerconsuption = b;
	   System.out.println("Brand:"+a+" \nPowerconsuption:"+b);
   }
   
   public abstract void turnOn();
}
