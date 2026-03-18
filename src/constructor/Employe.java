package constructor;

public class Employe extends Person {
   private int id;
   private int salary;
   
   public Employe(String s,int a,int id, int salary) {
	super(s,a);   // perameterized constructor called of parent class
	this.id = id;
	this.salary = salary;
	
	System.out.println("EmpId:"+id+ "\nName:"+s+"\nSalary:"+salary+"\nAge:"+a);
   }
   
   public static void main(String[] args) {
	 
	   
	   Person p1 = new Person("Aligarh",3);
	   
	   System.out.println();
	   Employe e1 = new Employe("ABC",43,234556,21000);
   }
 
}

