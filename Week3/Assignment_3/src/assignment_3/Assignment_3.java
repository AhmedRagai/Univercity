package assignment_3;
public class Assignment_3 
{
    public static void main(String[] args) 
    {
        Rock r =new Rock();
        r.Toss();
           
        Ball b = new Ball("Circle");
        b.Toss();
        b.bounce();
        
        Baseball ba = new Baseball("Small Circle");
        ba.Toss();
        ba.bounce();
        
        Football f =new Football("Middiam Circle");
        f.Toss();
        f.bounce();

    }
    
}
