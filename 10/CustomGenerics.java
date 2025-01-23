class A<T>{
    public void add(T a ,T b)
    {
        System.out.println();
    }
}
public class CustomGenerics{
        public static void main(String args[])
        {
            A<Integer> a1=new A<Integer>();
            a1.add(10,2);
            A<String> a2=new A<String>();
            a2.add("yash","sachdeva");
        }
}