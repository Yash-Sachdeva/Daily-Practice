import java.sql.*;
import java.io.*;
 
class JdbcDemo2{
 
	public static void main(String[] args){
		try{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			Class.forName("org.postgresql.Driver");
			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/demodb","postgres","tiger");
			Statement stmt=con.createStatement();
            stmt.addBatch("insert into EMPLOYEE values('Aman',25)");
            stmt.addBatch("insert into EMPLOYEE values('Akash',27)");
            stmt.addBatch("insert into EMPLOYEE values('Gaurav',33)");
            System.out.println("Wait for 10 seconds to see the whole batch execution...");
            Thread.sleep(20000);
            stmt.executeBatch();
            System.out.println("you can find all the records in the table   ");
			stmt.close();   
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
has context menu