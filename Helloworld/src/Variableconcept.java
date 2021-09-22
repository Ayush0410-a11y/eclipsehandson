class Employee{
	// data+methode--> instances--->
	
	int empno;
	double salary;
	String name;
	// increase the salary for employee with a bonus
	//methode -->salary + bonus
	
	public double increaseSalary(double bonus) {
		double newsalary;  //local variable--> simply any variable in a methode is said to called has local variable. its scope is within the block only
		newsalary = salary+bonus;
	//	System.out.println(newsalary);
		return newsalary;
	}
	
}

public class Variableconcept {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp = new Employee();
		
		//new -> it creates new memory for objects
		//employee->constructor-> it creates reference 
		emp.empno = 101;
		emp.name = "Ayush";
		emp.salary = 10000;
	//	System.out.println(emp.increaseSalary(2500));
	//	System.out.println(emp.empno);
	double output = emp.increaseSalary(3000);
	System.out.println(output);
		Employee emp1 = new Employee();
		emp1.empno = 102;
	//	System.out.println(emp1.empno);
	}

}
