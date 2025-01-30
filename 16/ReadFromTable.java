import java.io.*;
import java.sql.*;
import java.util.*;
public class ReadFromTable{
    public static void main(String args[])
    {
        try{
        Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/demodb","postgres","tiger");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter table name");
        String table=br.readLine();
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery("Select * from "+table);
        ResultSetMetaData rsmd=rs.getMetaData();
        int columns=rsmd.getColumnCount();
        while(rs.next())
        {
            for(int i=1;i<=columns;i++)
            {
                System.out.println(rsmd.getColumnName(i).toUpperCase()+":"+rs.getString(i));
            }
            //System.out.println("EID:"+rs.getString(1));
            //System.out.println("Name:"+rs.getString(2));
            //System.out.println("Age:"+rs.getInt(3));
            //System.out.println("Salary:"+rs.getInt(3));
            //System.out.println("Designation:"+rs.getString(3));
            System.out.println();
        }
        stmt.close();
        rs.close();
        br.close();
        
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}