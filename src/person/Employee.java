package person;

public class Employee extends Person {
	
	private int empId;
	private int salary;
	
//	Overloading
	public void setData(int eId,int s,String n,int a) {
		super.setData(n, a);
		empId = eId;
		salary = s;
	}
	
//	Override
	@Override
	public void GetData() {
		super.GetData();
		System.out.println("EmpId: "+empId);
		System.out.println("Salary: "+salary);
	}
	
	public static void main(String[] args) {
		Employee e1 = new Employee();
//		Person p1 = new Employee();
		e1.setData(2025, 32,"Ketan",2000);
		e1.GetData();
	}
	

}
