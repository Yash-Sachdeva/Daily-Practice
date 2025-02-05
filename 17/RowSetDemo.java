import java.util.*;
import java.sql.*;
import java.io.*;
import javax.sql.*;
import javax.sql.rowset.*;
public class RowSetDemo{
    public static void main(String args[])
    {
        try{
            //RowSetFactory rsf=RowSetProvider.newFactory();
            JdbcRowSet rs=RowSetProvider.newFactory().createJdbcRowSet();
            rs.setUrl("jdbc:postgresql://localhost:5432/demodb");
            rs.setUsername("postgres");
            rs.setPassword("tiger");
            rs.setCommand("Select * from emp");
            rs.execute();
            rs.addRowSetListener(new MyListener());
            rs.addRowSetListener(new MyListener2());
            while(rs.next())
            {
                System.out.println("eid"+rs.getInt(1));
                System.out.println("name"+rs.getString(2));
            }          
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

class MyListener implements RowSetDemo{
    public void cursorMoved(RowSetEvent evt)
    {
        System.out.println("-----CURSOR MOVED--------");
    }
    public void rowChanged(RowSetEvent evt)
    {
        System.out.println("-------ROW CHANGED----------");
    }
    public void rowSetChanged(RowSetEvent evt)
    {
        System.out.println("-------ROW SET CHANGED----------");
    }
}
class MyListener2 implements RowSetDemo
{
    public void cursorMoved(RowSetEvent evt)
    {
        System.out.println("-----CURSOR MOVED--------");
    }
    public void rowChanged(RowSetEvent evt)
    {
        System.out.println("-------ROW CHANGED----------");
    }
    public void rowSetChanged(RowSetEvent evt)
    {
        System.out.println("-------ROW SET CHANGED----------");
    }
}