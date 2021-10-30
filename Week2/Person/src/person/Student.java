package person;
public class Student extends persone
{
    final private String Status []={"freshman" , "sophomore" , "junior" , "senior"};
    
    public String Freshman()
    {
        return Status[0];
    }
    public String Sophomore()
    {
        return Status[1];
    }
    public String Junior()
    {
        return Status[2];
    }
    public String Senior()
    {
        return Status[3];
    }
    
    @Override
    public void Display()
    {
        super.Display();
        System.out.print("Student status : ");
    }
}