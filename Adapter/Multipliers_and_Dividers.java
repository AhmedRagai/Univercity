package multipliers_and_dividers;

public class Multipliers_and_Dividers 
{
    public static void main(String[] args) 
    {
        Multiplier m = new Multiplier();
        Divider d = new Divider();
        Adapter a =new Adapter();
        
        m.BigDecimal_Multiply(m);
        d.BigDecimal_Divide(d);
        
        m.BigDecimal_Multiply((Multiply)a);
    }
    
}
