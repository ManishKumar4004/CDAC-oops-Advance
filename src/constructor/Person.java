package constructor;

public class Person {

   // instance varibles
   private String Name;
   private int Age;
   
   // perametrized constructor
   public Person(String name, int age) {
	Name = name;
	Age = age;
	System.out.println("Name: "+Name+"\nAge: "+age);
   } 
}
