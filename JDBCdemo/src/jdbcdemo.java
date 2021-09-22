import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;

public class jdbcdemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//register your driver
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/wipro","root","Akku");
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter emp number");
//		int empno=sc.nextInt();
//		System.out.println("enter the emp name");
//		String empname=sc.next();
//		System.out.println("emp emailid");
//		String emailid=sc.next();
//		System.out.println("emp phone number");
//		int phoneno=sc.nextInt();
//		String sql="insert into employees values(?,?,?,?)";
//		PreparedStatement ps=con.prepareStatement(sql);
//		ps.setInt(1,empno);
//		ps.setString(2, empname);
//		ps.setNString(3, emailid);
//		ps.setInt(4, phoneno);
//		int i=ps.executeUpdate();
//		if(i>0) {
//		System.out.println("insertion is done");
//	}
//	else {
//		System.out.println("insertion is not done");
//	}
//		ps.close();
		 	
		
		
		
		
		//System.out.println(con);
		//st is the object used to write the sql queries
		Statement st=con.createStatement();
		//String sql="insert into employees values(105,'kunal','kunal@gmail.com',6023)";
		String sql= "select * from employees";
		ResultSet rs=st.executeQuery(sql);
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getInt(4));
		}
		
		
//		int i=st.executeUpdate(sql);
//		if(i>0) {
//			System.out.println("insertion is done");
//		}
//		else {
//			System.out.println("insertion is not done");
//		}
		
		// close the connection
		st.close();
		con.close();
	}

}
