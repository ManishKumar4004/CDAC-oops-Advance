package quest5;

public class Childclass extends ParentClass {
    public void childmethod() {
    	System.out.println("Child class method Called...");
    }
    
    public static void main(String[] args) {
//    	method of parent called by Object of parent class
	   ParentClass p1 = new ParentClass();
       p1.pmethod();
       
//	    Method of child class by Object of Child class
       Childclass c = new Childclass();
       c.childmethod();
       
//       Method of parentclass by Object of child class;
       c.pmethod();
	}
}
