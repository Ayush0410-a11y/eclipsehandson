class student {
	int regno;
	String name;
	static String colzname = "IIT";
	public student(int regno, String name) {
		
		this.regno = regno;
		this.name = name;
		
	}
	void change(String colzname) {
		this.colzname = colzname;
	}
	
	static void dispaly() {
		System.out.println(colzname);
	}
	
	
}
public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student stu1 = new student(101,"kk");
		//student stu2 = new student(102,"ll");
		//student stu3 = new student(103,"pp");
		stu1.change("NIT");
		//stu1.dispaly();
		//stu2.dispaly();
		//stu3.dispaly();
		student.dispaly();
	}

}
