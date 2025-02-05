import java.util.*;
import java.io.*;
import java.util.function.*;
public class PredicateDemo{
    public static void main(String args[])
    {
        int arr[]={11,22,33,44,55,66,77,88,99};
        //evenNumbers(arr);
        Predicate<Integer>p1=(x)->x%2==0;
        Predicate<Integer>p2=(x)->x>50;
        process(arr,p1);
        process(arr,p1.negate());
        process(arr,p1.and(p2));
    }
    public static void process(int arr[],Predicate<Integer>p)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(p.test(arr[i]))
            {
                System.out.println(arr[i]);
            }
        }
    }
}