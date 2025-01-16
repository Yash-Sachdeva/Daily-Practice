import java.io.*;   
// these type of data should not be modified that is why we need immutable class 
/*
class Transaction
{
    int fromAcctNo;
    int toAcctNo;
    String ifsc;
    int amount;
}
*/
/*
final class Student implements Serializable{
    private final int rollNo;
    private final String name;
    private final int standard;
    public Student (int rn,String n,int s)
    {
        rollNo=rn;
        name=n;
        standard=s;
    }
    public int getRollNo()
    {
        return rollNo;
    }
    public String getName()
    {
        return name;
    }
    public int getStandard()
    {
        return standard;
    }
    public String toString()
    {
        return "Student[Roll No. :]"+rollNo+",Name: "+name+",Standard:"+standard+"]";
    }
}
*/
record Student(int rollNo,String name,int standard)
{
    static String schoolName="DPS";
    Student()
    {
        this(22,"Raj",3);
    }
    Student(int rollNo,String name,int standard)
    {
        if(rollNo<0)
        {
            throw new NullPointerException();
        }
        this.rollNo=rollNo;
        this.name=name;
        this.standard=standard;
    }
    public void display()
    {
        System.out.println("School Name"+schoolName);
    }
    public boolean equals(Object obj)
    {
        if(this.rollNo==((Student)obj).rollNo)
        {
            return true;
        }
        return false;
    }

    public int hashCode()
    {
        return this.rollNo; 
    }
}

public class ImmutableClass{
    public static void main(String args[])
    {
        Student s1=new Student(11,"Rinku",5);
        Student s2=new Student(12,"Mintu",7);
        //Student s3=new Student();
        System.out.println(s1);
        System.out.println(s2);
        //System.out.println(s3);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        //System.out.println(s3.hashCode());
        s1.display();
        s2.display();
        //s3.display();
    }
}