import java.util.*;
/*
public class LangDemo{
    public static void main(String args[])
    {
        String s1="hello";
        System.out.println(s1);
        s1="hi";
        System.out.println(s1);
        s1=s1.toUpperCase();
        System.out.println(s1);

        StringBuffer sb1=new StringBuffer("hi");
        sb1.append("hello");
        System.out.println(sb1);
    }
}

class Emp{
    String designation;

}
*/
public class LangDemo{
    public static void main(String args[]) throws Exception
    {
        Runtime rt=Runtime.getRuntime();
        System.out.println("Wait and see the magic....in 10 seconds from now");
        Thread.sleep(10000);
        //rt.exec("calc.exe");  it does not close the calculator itself
        Process p1=rt.exec("notepad.exe");
        Thread.sleep(5000);
        Process p2=rt.exec("mspaint.exe");
        Thread.sleep(5000);
        System.out.println("Just wait and let it disappear");
        p2.destroy();
        Thread.sleep(5000);
        System.out.println("Did you see it disapper");
    }
}