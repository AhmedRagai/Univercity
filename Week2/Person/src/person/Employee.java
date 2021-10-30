package person;
public class Employee extends persone
{
    private String Office;
    private String Date_hired;
    private float Salary;
    
    public Employee()
    {
    }
    public Employee(String of,String date ,float sa)
    {
        Office = of;
        Date_hired = date;
        Salary = sa;
    }
            
    public void set_office(String off)
    {
        Office = off;
    }
    public void set_date_hired(String date)
    {
        Date_hired = date;
    }
    public void set_salary(float sa)
    {
        Salary = sa;
    }
    
    public String get_office()
    {
        return Office;
    }
    public String get_date_hired()
    {
        return Date_hired;
    }
    public float get_salary()
    {
        return Salary;
    }
    
    @Override
    public void Display()
    {
        super.Display();
        System.out.println("The Office name : "+Office +" \t|The Date hired : "+Date_hired +" \t|The Salary : "+Salary);
    }
}