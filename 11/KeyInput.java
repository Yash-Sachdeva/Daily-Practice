import java.io.*;
public class KeyInput
{
    public static void main(String args[])
    {
        try{
            //InputStreamReader isr=new InputStreamReader(System.in);
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            // this statement means taking input from the keyboard and then converting it to byte stream and then passing it to the 
            // buffer stream and assigning it to the string name variable

            String name=br.readLine();
            System.out.println("input is "+name);
            // as readline return type is of string datatype so we have to parse it manually to convert it into intger datatype
            int age=Integer.parseInt(br.readLine());
            System.out.println("age is :"+(age+10));
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}