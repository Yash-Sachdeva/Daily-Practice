import java.util.*;
class A implements AutoCloseable{
    A()
    {
        System.out.println("Allocating resources for A class object");
    }
    public void process()
    {
        System.out.println("Performing the required processing of A object");
    }
    public void release()
    {
        System.out.println("Releasing resources for A class object");   
    }
}
class B implements AutoCloseable{
    B()
    {
        System.out.println("Allocating resources for B class object");
    }
    public void process()
    {
        System.out.println("Performing the required processing of B object");
    }
    public void release()
    {
        System.out.println("Releasing resources for B class object");   
    }
}
public class TryWithResources{
    public static void main(String args[])
    {
        
        try(A a1=new A(); B b1=new B();)
        {
            a1.process();
            if(true)
                throw new  NullPointerException();
            a1.release();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally{
            a1.release();
        }
        System.out.println(a1);
    }
    
}