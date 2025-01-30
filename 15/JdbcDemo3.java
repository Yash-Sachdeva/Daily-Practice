import java.sql.*;
import java.io.*;
 
class JdbcDemo3{
 
	public static void main(String[] args){
		try{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			Class.forName("org.postgresql.Driver");
			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/demodb","postgres","tiger");
			PreparedStatement pstmt=con.prepareStatement("insert into Emp values(?,?,?,?,?)");
			System.out.print("Enter Employee id:");
			int eid=Integer.parseInt(br.readLine());
			System.out.print("Enter name:");
			String name=br.readLine();
			System.out.print("Enter age:");
			int age=Integer.parseInt(br.readLine());
			System.out.print("Enter Salary:");
			int salary=Integer.parseInt(br.readLine());
			System.out.print("Enter designation:");
			String designation=br.readLine();
 
			pstmt.setInt(1,eid);
			pstmt.setString(2,name);	
			pstmt.setInt(3,age);
			pstmt.setInt(4,salary);
			pstmt.setString(5,designation);
			CallableStatement cstmt=con.prepareCall("CALL dummy_record()");

 
 
			pstmt.execute();	
			cstmt.execute();
 
			pstmt.close();
			cstmt.close();
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
has context menu