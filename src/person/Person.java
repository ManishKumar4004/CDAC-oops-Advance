package person;

public class Person {
   private String name;
   private int age;
   
   
   public void setData(String n,int a) {
	   name = n;
	   age = a;
   }
   public void GetData() {
	   System.out.println("Name: "+name);
	   System.out.println("Age: "+age);
   }
  
}
