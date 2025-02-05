@FunctionalInterface
interface I {
    public void abc(); // Only one abstract method
}

class A implements I {
    public void abc() {
        System.out.println("abc method executed");
    }
}

class B{
    public void demo()
    {
        System.out.println("inside b ");
    }
}
public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        I i1 = new A(); 
        i1.abc(); 
        I i2=new I()
        {
            public void abc()
            {
                System.out.println("anonymous class");
            };
        };
        i2.abc();
        B b1= new B()
        {
            public void demo()
            {
                System.out.println("inside the b demo anonymous");
            };
        };
        b1.demo();

        I i3= ()-> System.out.println("from lambda expression");
        i3.abc();
    }
}
