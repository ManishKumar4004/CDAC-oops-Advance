package quest6;

public class Manager extends Member{
       private String Specialization;
       private String Dept;
	  
       public Manager(String name, int gae, long phoneNo, String address, int salary, String specialization, String dept) {
		super(name, gae, phoneNo, address, salary);
		Specialization = specialization;
		Dept = dept;
	   }
       
       
       
      @Override
	public String toString() {
		return "Manager [Specialization=" + Specialization + ", Dept=" + Dept + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}



	   public static void main(String[] args) {
		Manager m1 = new Manager("Alice",32,345677834,"S.R Nagar",100000,"Java","Tech");
		System.out.println(m1.toString());
	}
       
}
