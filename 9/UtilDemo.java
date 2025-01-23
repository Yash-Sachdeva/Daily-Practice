import java.util.*;
public class UtilDemo{
    public static void main(String args[])
    {
        Date d1=new Date();
        System.out.println(d1);
        //d1.setTime(324234);
        System.out.println(d1);
        Date d2=new Date();
        d2.setTime(-9993992492374L);
        d1.setMonth(48);
        System.out.println(d1);
        System.out.println(d1.getYear());

        Stack s1=new Stack();
        s1.push("111");
        s1.push("222");
        s1.push("333");
        //System.out.println(s1.pop());
        // pop removes the element peek only prints the element
        System.out.println(s1.peek());
        System.out.println(s1.empty());
        System.out.println(s1.search("222"));// prints -1 if the element is not present and the position not the index of the element 


        //bitset- works on bits displays in sets

        BitSet b1=new BitSet(16);
        BitSet b2=new BitSet(16);
        for(int i=0;i<16;i++)
        {
            if(i%3==0)
                b1.set(i);
            if(i%4==0)
            {
                b2.set(i);
            }
        }
        System.out.println(b1);
        System.out.println(b2);
        //b1.and(b2);    // interesection result 
        //b1.or(b2);       // union result 
        b1.xor(b2);
        System.out.println(b1);
    }
}