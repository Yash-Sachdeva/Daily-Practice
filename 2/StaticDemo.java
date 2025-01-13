class A{
    static int x;
    int y=10;
    /*public static void abc()
    {
        System.out.println("From static method"+y);
    }
    */
   // non static cannot be referenced from static context
   
}

public class StaticDemo{
    public static void main(String args[])
    {
        A a1=new A();
        A a2=new A();
        a1.x=10;
        a2.x=20;
        a2.x=50;
        System.out.println(A.x);
        System.out.println(a1.x);
        System.out.println(a2.x);
    }
}