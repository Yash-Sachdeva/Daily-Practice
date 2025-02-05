interface I{
    public void abc(); // if we don't use default it will become abstract // if it is abstracr it should be implenmented by the subclass    
    public default void xyz() // default is used so that interface methods can have body 
    {
        System.out.println("Some logic in xyz");
    }
    public static void atoz()
    {
        System.out.println("FROM ATOZ");
    }
    private void demo()
    {
        System.out.println("Private  method in interface");
    }
}
interface X{
    public default void func(){
        System.out.println("From X interface");
    }
}
interface Y{
    public default void func(){
        System.out.println("From Y interface");
    }
}
class B implements X,Y{
    public void func(){
        X.super.func();
        Y.super.func();
        System.out.println("From B class");
    }
}
class A implements I{
    public void abc()
    {
        System.out.println("ABC class");
    }
}
public interface LatestInterface{
    public static void main(String args[])
    {
        System.out.println("Hello");    
        I.atoz();
        A a1=new A();
        a1.abc();
        a1.xyz();
    }
}