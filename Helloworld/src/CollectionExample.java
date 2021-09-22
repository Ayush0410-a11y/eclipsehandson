import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class studentInfo{
	private int regno;
	private String name;
	private String eamil;
	public studentInfo(int regno, String name, String eamil) {
		super();
		this.regno = regno;
		this.name = name;
		this.eamil = eamil;
	}
	public int getRegno() {
		return regno;
	}
	public String getName() {
		return name;
	}
	public String getEamil() {
		return eamil;
	}
	
	
	
}

public class CollectionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter student regno");
		int regno = sc.nextInt();//used take integer value
		System.out.println("enter student name");
		String name = sc.next(); // used to take string
		System.out.println("enter student email");
		String email = sc.next();
		
		studentInfo s1 = new studentInfo(regno,name,email);
		studentInfo s2 = new studentInfo(102,"raj","raj6558@gmail.com");
		studentInfo s3 = new studentInfo(103,"babush","babush6558@gmail.com");
		ArrayList<studentInfo> al = new ArrayList();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		Iterator i = al.iterator();
		while(i.hasNext()) {
			studentInfo s =(studentInfo)i.next();// object value
			System.out.println(s.getRegno()+"    "+s.getName()+"   "+s.getEamil());
			
		}
		System.out.println(al);
	}

}
