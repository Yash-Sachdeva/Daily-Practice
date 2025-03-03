import java.util.regex.*;
public class PatternMatching{
    public static void main(String args[])
    {
        String s1="Wissen Technology";
        String s2="Tech";
        //System.out.println(s1.contains(s2)); 
        // without using contains()
        // using regex
        Pattern p1= Pattern.compile(s2);
        Matcher m1=p1.matcher(s1);

        System.out.println(m1.find());
        String email="abc@xyz.com";
        Pattern p2=Pattern.compile(".*@.*\\..*");
        Matcher m2=p2.matcher(email);
        System.out.println(m2.matches());


        long mobileNo=987654329L;
        Pattern p3=Pattern.compile("[8-9][0-9]{9}");
        Matcher m3=p3.matcher(mobileNo);
        System.out.println(m3.matches());

        String str="abcdp";
        Pattern p4a=Pattern.compile("[a-d][p-r]");
        Pattern p4b=Pattern.compile("[a-d]&&[b-f]");
        Matcher m4a=p4a.matcher(str);
        Matcher m4b=p4b.matcher(str);
        System.out.println(m4a.matches());
        System.put.println(m4b.matches());
    }
}