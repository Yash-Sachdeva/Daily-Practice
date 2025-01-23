import java.util.*;
public class CollectionDemo{
    public static void main(String args[])
    {
        /*
        Vector v1=new Vector(2);
        v1.add("HELLO");
        v1.add(23324);
        v1.add(new Date());
        v1.add(new Thread());
        v1.add(324.33);
        Enumeration e=v1.elements();
        while(e.hasMoreElements())
        {
            System.out.println(e.nextElement());
        }
        System.out.println("--------------");
        HashSet obj=new HashSet();
        TreeSet obj=new TreeSet();
        LinkedHashSet obj=new LinkedHashSet();
        obj.add("111");
        obj.add("222");
        obj.add("333");
        obj.add("444");
        obj.add("555");
        Iterator i=obj.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
        */
        Hashtable mobj=new Hashtable(); // add does not work
        mobj.put("111","yash1");
        mobj.put("222","yash2");
        //mobj.put("222","yash6");
        mobj.put("333","yash3");   
        Set s=mobj.entrySet(); 
        Iterator mi=s.iterator();
        while(mi.hasNext())
        {
            Map.Entry me =(Map.Entry)mi.next();
            System.out.println("ID :"+me.getKey());
            System.out.println("Name: "+me.getValue());
        }
        
    }
}