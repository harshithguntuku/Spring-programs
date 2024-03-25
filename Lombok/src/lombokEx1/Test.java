package lombokEx1;

public class Test {

	public static void main(String[] args) {

// Constructor injecting values
		Employee employee = new Employee(1001, "Harshith", 123433.34);
		System.out.println(employee);
		
//Setters are injecting the values
		Employee employee2 = new Employee();
		employee2.setEmpId(1002);
		employee2.setEmpName("Happy");
		employee2.setEmpSalary(74523.34);
		
		System.out.println(employee2.getEmpId()+" "+employee2.getEmpName()+" "+employee2.getEmpSalary());
	}

}
