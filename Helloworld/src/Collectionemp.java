import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

//POJO(plsin old java object), bean
class Employeess{
	
	//1 instance data members to be private,2. constructor, 3. getter to get the info
	private int empno;
	private String empname;
	private double salary;
	public Employeess(int empno, String empname, double salary) {
		
		this.empno = empno;
		this.empname = empname;
		this.salary = salary;
	}
	public int getEmpno() {
		return empno;
	}
	public String getEmpname() {
		return empname;
	}
	public double getSalary() {
		return salary;
	}
	
	
}
public class Collectionemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Employeess> al = new ArrayList();
		Employeess e[] = new Employeess[3];// creating a class name as an array
		for(int i=0;i<3;i++) {
		System.out.println("enter student emp no");
		int empno = sc.nextInt();//used take integer value
		System.out.println("enter employee name");
		String empname = sc.next(); // used to take string
		System.out.println("enter employee salary");
		double salary = sc.nextDouble();
		e[i]= new Employeess(empno, empname, salary);
		al.add(e[i]);
	}
		Iterator<Employeess> i = al.iterator();// base address of employee
		while(i.hasNext()) // hasNext check whether it has a value or not 
			{
			Employeess e1 =(Employeess)i.next(); //i.next--> gets the value & moves iterator to next location
			System.out.println(e1.getEmpno()+"   "+e1.getEmpname()+"  "+e1.getSalary());
			
		}
		System.out.println(al);
	}
}
