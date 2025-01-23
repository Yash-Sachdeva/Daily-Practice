class A{
    int x;
    A(int x)
    {
        this.x=x;
    }
    public void finalize()
    {
        System.out.println("Object with x value :"+x+"is getting removed...");
    }
}
public class LangDemo2{
    public static void main(String args[]) throws Exception
    {
        A a1=new A(10);
        A a2=new A(20);
        A a3=new A(30);
        a2.finalize();
        System.out.println(a1.x);
        System.out.println(a2.x);
        System.out.println(a3.x);

        Class c1=a1.getClass();
        System.out.println("Enter the name");
        Class c2=
        System.out.pr
    }

}