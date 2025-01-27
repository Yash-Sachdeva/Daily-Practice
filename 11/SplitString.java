import java.util.*;
public class SplitString
{
    public static void main(String args[])
    {
        String str="Raju|25|3000|Tester";
        StringTokenizer st=new StringTokenizer(str,"|,;.@");
        int count=st.countTokens();
        for(int i=0;i<count;i++)
        {
            System.out.println("Name="+st.nextToken());
        }
        
        //System.out.println("Age="+st.nextToken());
    }
}