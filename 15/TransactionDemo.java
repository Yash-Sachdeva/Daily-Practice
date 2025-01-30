import java.util.*;
import java.sql.*;
import java.io.*;
public class TransactionDemo{
    public static void main(String args[])
    {
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			Class.forName("org.postgresql.Driver");
			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/demodb","postgres","tiger");
            con.setAutoCommit(false);
			PreparedStatement pstmt=con.prepareStatement("insert into EMPLOYEE values(?,?)");
            for(int i=1;i<=10;i++)
            {
                System.out.println("\nEnter name");
                String name=br.readLine();

                System.out.println("Enter age");
                int age=Integer.parseInt(br.readLine());

                pstmt.setString(1,name);
                pstmt.setInt(2,age);
                pstmt.execute();
                if(i==5)
                {
                    con.rollback();
                }
                if(i==10)
                {
                    con.commit();
                }
            }
            pstmt.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}