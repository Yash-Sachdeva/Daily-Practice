import java.io.*;
public class RAFDemo{
    public static void main(String args[])
    {
        try{
            /*
            RandomAccessFile raf=new RandomAccessFile("abc.txt","rw");
            raf.seek(5);
            System.out.println(raf.readLine());
            System.out.println(raf.readLine()); 
            System.out.println(raf.length());
            raf.writeBytes("Just for demo");
            */
           //PrintWriter pw=new PrintWriter(System.out);             // does not append 
           //PrintWriter pw=new PrintWriter(new File("abc.txt"));   // this overrides
           PrintWriter pw=new PrintWriter(new FileOutputStream("abc.txt",true));   // this also does not append without append mode true
           pw.println("Hello Everybody");
           pw.flush();
           pw.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}