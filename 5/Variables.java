public class Variables{
    public static void main(String args[])
    {
        int a;
        a=50;
        System.out.println(a);
        float var=3.142f;
        System.out.println(var);
        String choice="1.0";
        enum Gender{
            MALE,FEMALE;
        }
        enum Month{
            JAN,FEB,MARCH
        }
        String res=
        switch(Month.JAN)
        {
            case JAN,FEB,MARCH -> "SPRING";
        };
        
        /*
        switch(Gender.FEMALE)
        {
            case MALE:System.out.println("ONE");
            case FEMALE:System.out.println("TWO");
            default:System.out.println("Default");
        }
        */
       System.out.println(res);
    }
}