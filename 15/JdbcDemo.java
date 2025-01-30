import java.sql.*;
import java.util.*;

public class JdbcDemo{
    public static void main(String args[])
    {
        try{
            Scanner sc = new Scanner(System.in);
            Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/demodb","postgres","tiger");
            Statement smt=con.createStatement();
            //smt.execute("insert into EMPLOYEE values('Raju',59)");
            System.out.print("Enter Name : ");
            String name = sc.nextLine();
            System.out.print("Enter the age : ");
            int age = sc.nextInt();
            smt.executeUpdate("Insert into EMPLOYEE values('"+name+"',"+age+")");
            ResultSet rs=smt.executeQuery("select * from EMPLOYEE;");
            while(rs.next())
            {
                System.out.println("Name"+rs.getString(1));
                System.out.println("Age"+rs.getInt(2));
                System.out.println();
            }
            rs.close();
            smt.close();
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
