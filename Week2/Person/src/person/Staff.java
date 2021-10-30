package person;
public class Staff extends Employee
{
    private String Title;
    
    public Staff()
    {
        
    }
    public Staff(String title)
    {
        Title = title;
    }
    
    public void set_Title(String title)
    {
        Title = title;
    }
    public String get_Title()
    {
        return Title;
    }
    
    @Override
    public void Display()
    {
        super.Display();
        System.out.println("The Job Title : "+Title);
    }
}