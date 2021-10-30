package person;
public class Faculty extends Employee
{
    private int Office_Hour;
    private String Rank;
    
    public Faculty()
    {
        
    }
    public Faculty(int of ,String r)
    {
        Office_Hour = of;
        Rank = r;
    }
    
    public void set_Hour (int h)
    {
        Office_Hour = h;
    }
    public void set_Rank (String r)
    {
        Rank = r;
    }
    public int get_Hour ()
    {
        return Office_Hour;
    }
    public String get_Rank()
    {
        return Rank;
    }
    
    @Override
    public void Display()
    {
        super.Display();
        System.out.println("The Office Hour : "+Office_Hour +" \t|The Rank : "+Rank);
    }
}