package faculty;
public class Teaching_Assistant implements Staff
{
    @Override
    public void Get_Salary(double salary) 
    {
        System.out.println("The Salary of Assistant = " +salary);
    }

    @Override
    public void Get_Year_of_Work(int year) 
    {
        System.out.println("The number of year that Assistant work on his lifecarrer = " +year);
    }   
}
