package program2_student;
public class Subject extends Student
{
    private String Sub_Name;
    private int Sub_ID;
    private int Sub_Hour;
    
    public Subject()
    {
        
    }
    public Subject(String name,int id,int hour)
    {
        Sub_Hour = hour;
        Sub_ID = id;
        Sub_Name = name;
    }
    
    public void set_Name(String name)
    {
        Sub_Name = name;
    }
    public void set_ID(int id)
    {
        Sub_ID = id; 
    }
    public void set_Hour(int hour)
    {
        Sub_Hour = hour;
    }
    
    public String get_Name()
    {
        return Sub_Name;
    }
    public int get_ID()
    {
        return Sub_ID; 
    }
    public float get_Hour()
    {
        return Sub_Hour;
    }
    
    @Override
    public void Display()
    {
        super.Display();
        System.out.println("Subject Name : "+Sub_Name +" \t|Subject ID : "+Sub_ID +" \t|Subject Hour : "+Sub_Hour);
    }
}