import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Retreivedata {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Connection con=DBConnection.getConnection();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the empno");
        int empno=sc.nextInt();
//        String sql="select * from employees where empno=?";
//        PreparedStatement ps=con.prepareStatement(sql);
//        ps.setInt(1,empno);
        String sql="call retriveEmp(?)";
        CallableStatement ps=con.prepareCall(sql);
        ps.setInt(1, empno);
        ResultSet rs=ps.executeQuery();//base address of the table
        while(rs.next()) {
            System.out.println(rs.getInt(1)+" "+rs.getString(2));
            
            
        }
        
    }
}