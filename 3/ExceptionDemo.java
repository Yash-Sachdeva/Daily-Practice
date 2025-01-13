import java.util.*;
import java.sql.*;
import java.io.*;
public class ExceptionDemo{
    public static void main(String args[])
    {
        int a=5;
        try{
        for(int i=1;i<=20;i++)
        {
            System.out.println(i);
            int res=a/(a-i);
            if(i==150)
            {
                throw new NullPointerException();
            }
            if(i==120)
            {
                throw new IOException();
            }
            if(i==10)
            {
                throw new SQLException();
            }
        }
        }
        catch(IOException e)
        {
            System.out.println("Io exception handles");
        }
        catch(NullPointerException | SQLException e)
        {
            System.out.println("Null Exception occur");
        }
        catch(Exception e)    // handle any kind of exception and the program terminates
        {
            System.out.println("Defualt Exception");
        }
        catch(UserException e)
        {
            System.out.println("User Exception");
        }
        System.out.println("program continues");
    }
}
