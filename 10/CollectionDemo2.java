import java.util.*;
public class CollectionDemo2{
    public static void main(String args[])
    {
        List list=new LinkedList();
        list.add("111");
        list.add("666");
        list.add("444");
        list.add("222");
        list.add("555");
        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        Collections.swap(list,2,3);
        Collections.shuffle(list);
    }
}