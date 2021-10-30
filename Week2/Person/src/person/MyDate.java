package person;
public class MyDate extends persone
{
    int Year;
    int Month;
    int Day;
            
    public MyDate(int d,int m,int y)
    {
        this.Day = d;
        this.Month = m;
        this.Year = y;
    }
    
    @Override
    public void Display()
    {
        System.out.println("The Date of coming : "+Day +" / " +Month +" / " +Year);
    }
}