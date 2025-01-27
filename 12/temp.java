class Demo{
    // init block (initializing block)
    {
        System.out.println("hello");
    }
    Demo()
    {
        System.out.println("demo const");
    }
        Demo(int i)
    {
        System.out.println("demo(int) const");
    }
        Demo(String s)
    {
        System.out.println("demo(string) const");
    }
    static{
        System.out.println("static");
    }
    public static void main(String args[])
    {
        System.out.println("yash");
        Demo d1=new Demo();
        Demo d2=new Demo(11);
        Demo d3=new Demo("abc");

    }
}