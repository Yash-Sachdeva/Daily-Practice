class A
{
	public class B
	{
		public class C
		{
			public void demo()
			{
				System.out.println("I am coming from the innermost class method");
			}
		}
	}
    static class D{
        static class E{
                public static void demo()
                {
                    System.out.println("hello");
                }
        }
    }
}
public class InnerClasses
{
	public static void main(String args[])
	{
        A a1 = new A();
        A.B b1 = a1.new B();
        A.B.C c1 = b1.new C();
        c1.demo();
        A.D.E.demo();
	}
}