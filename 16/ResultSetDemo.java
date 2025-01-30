import java.sql.*;
public class ResultSetDemo{
    public static void main(String args[])
    {
        try{
            Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/demodb","postgres","tiger");
            //Statement stmt=con.createStatement(ResultSet.CONCUR_READ_ONLY,ResultSet.TYPE_FORWARD_ONLY);
            Statement stmt=con.createStatement(ResultSet.TYPE_FORWARD_ONLY,ResultSet.CONCUR_UPDATABLE);
            //Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE)
            ResultSet rs=stmt.executeQuery("SELECT * FROM EMPLOYEE")
            // by default rs returns an object i.e previous to the first element
            // rs.next() to point to the first entry

            while(rs.next()){
                System.out.println("Name:"+rs.getString(1));
                System.out.println("Age:"+rs.getInt(2));
                System.out.println();
            }
            System.out.println("---------------------");
            rs.absolute(3);
            while(rs.previous()){
                System.out.println("Name:"+rs.getString(1));
                System.out.println("Age:"+rs.getInt(2));
                System.out.println();
            }
            System.out.println("---------------------");
            rs.updateString(1,"Mohan")
            {
                System.out.println("Name:"+rs.getString(1));
                System.out.println("Age:"+rs.getInt(2));
            }
            System.out.println("---------------------");
            rs.relative(-2)
            {
                System.out.println("Name:"+rs.getString(1));
                System.out.println("Age:"+rs.getInt(2));
            }
            System.out.println("---------------------");
            rs.first()   //rs.beforeFirst();
            {
                System.out.println("Name:"+rs.getString(1));
                System.out.println("Age:"+rs.getInt(2));
            }
            
            rs.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}