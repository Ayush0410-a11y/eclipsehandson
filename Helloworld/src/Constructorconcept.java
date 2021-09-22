class Employee1{
	
	int empno;
	double salary;
	String name;
	Employee1(int empno,double salary,String name){
		//System.out.println(salary+bonus);
		//LHS=RHS--> name collision
		//this.empno--> instance varaible
		this.empno=empno;
		this.salary=salary;
		this.name=name;
	}
	
	void display() {
		System.out.println(empno+"   "+salary+"   "+name);
	}
}

public class Constructorconcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 emp = new Employee1(101,10000,"Ankit");
		emp.display();
	}

}
