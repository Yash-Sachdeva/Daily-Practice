import java.util.*;
class Student implements Comparable{
    int rollNo;
    String name;
    int standard;
    public Student(int rn,String n,int s){
        rollNo=rn;
        name=n;
        standard=s;
    }
    public String toString()
    {
        System.out.println("Roll No:"+rollNo);
        System.out.println("Name:"+name);
        System.out.println("Standard:"+standard);
        return "";
    }
    public boolean equals(Object obj)
    {
        Student s=(Student)obj;
        if((this.rollNo==s.rollNo) && (this.standard==standard))
        {
            return true;
        }
        else{
            return false;
        }   
    }
    public int hashCode()
    {
        return standard;
    }
    public int compareTo(Object obj)
    {
        Student s=(Student)obj;
        return name.compareTo(s.name)*-1;
        // return new Integer(standard).compareTo(s.standard);
    }
}
public class StudentList{
    public static void main(String args[])
    {
        HashSet hs=new HashSet();
        hs.add(new Student(11,"Yash",5));
        hs.add(new Student(22,"Rinku",6));
        hs.add(new Student(33,"Sanju",5));
        hs.add(new Student(44,"Manju",4));
        Iterator i=hs.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}