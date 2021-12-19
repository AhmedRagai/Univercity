package multipliers_and_dividers;

public class Adapter extends Divider
{
    private Divide d ;
    public Adapter Divider_Adapter(Adapter a)
    {
        d = BigDecimal_Divide(a);
        return (Adapter)d;
    }
}
