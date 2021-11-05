package assignment_3;
public class Ball extends Tossable
{
    public String Brand_Name;
    
    @Override
    void Toss() 
    {
        
    }  
    public Ball(String BrName)
    {
        Brand_Name = BrName;
    }
    
    public String get_BrName()
    {
        return Brand_Name;
    }
    
    public void bounce()
    {
        
    }
    
}
