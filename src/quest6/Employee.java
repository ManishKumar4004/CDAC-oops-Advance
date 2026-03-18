package quest6;

public class Employee extends Member{
 
  private String Specialization;
  private String Dept;
  
  public Employee(String name, int gae, long phoneNo, String address, int salary,String sp,String dp) {
		super(name, gae, phoneNo, address, salary);
		Specialization = sp;
		Dept = dp;
	}

  @Override
  public String toString() {
	return "Employee [Specialization=" + Specialization + ", Dept=" + Dept + ", getClass()=" + getClass()
			+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
  }
  
  public static void main(String[] args) {
	Employee E = new Employee("Robert",21,234567899,"S.B Nagar",20000,"Python","NonTech");
	System.out.println(E.toString());
	}
  
}
