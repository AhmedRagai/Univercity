package faculty;
public class Doctor implements Staff
{
    @Override
    public void Get_Salary(double salary) 
    {
        System.out.println("The Salary of Doctor = " +salary);   
    }

    @Override
    public void Get_Year_of_Work(int year) 
    {
        System.out.println("The number of year that doctor work on his lifecarrer = " +year);
    }
}
