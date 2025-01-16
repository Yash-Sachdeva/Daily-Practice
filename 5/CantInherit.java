sealed class Manager permits SalesManager{
    int x=10;
    public void abc()
    {
        System.out.println("HI");
    }
}
class Peon //extends Manager
{
}
final class SalesManager extends Manager{

}
sealed class MarketingManager extends Manager permits DistributionManager{

}
final class DistributionManager extends MarketingManager{

}
class GlobalManager extends MarketingManager{

}
public class CantInherit{
    public static void main(String args[] )
    {
        
    }
}