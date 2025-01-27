import java.io.*;
import java.util.*;
class Person{
    private String name;
    private int age;
    private int salary;
    private String designation;
    public Person()
    {
        readDetails();
    }
    void readDetails()
    {
        try{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter name");
        name=br.readLine();
        System.out.println("Enter age");
        age=Integer.parseInt(br.readLine());
        System.out.println("Enter salary");
        salary=Integer.parseInt(br.readLine());
        System.out.println("Enter designation");
        designation=br.readLine();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public static void writeToFile()
    {
        try{
        PrintWriter pw=new PrintWriter(new FileOutputStream("employees.csv",true));
        pw.println(name+","+age+","+salary+","+designation);
        pw.flush();
        pw.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public static void display() 
    {
        try{
        BufferedReader fr=new BufferedReader(new FileReader("employees.csv"));
        String line=null;
        while((line=fr.readLine())!=null)
        {
            StringTokenizer st=new StringTokenizer(line,",");
            System.out.println("Name:"+st.nextToken());
            System.out.println("Name:"+st.nextToken());
            System.out.println("Name:"+st.nextToken());
            System.out.println("Name:"+st.nextToken());
        }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
public class ReadWriteFile{
    public static void main(String args[]) 
    {

        int ch=0;
        try{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        do{
            System.out.println("1. Create");
            System.out.println("2. Display");
            System.out.println("3. Exit");
            System.out.println("Enter Choice");
            ch=Integer.parseInt(br.readLine());
            switch(ch)
            {
                case 1-> new Person().writeToFile();
                case 2-> Person.display();
            }
        }
        while(ch!=3);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}