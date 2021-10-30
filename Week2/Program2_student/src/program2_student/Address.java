package program2_student;
public class Address extends Student
{
    int Street_NO;
    String City;
    String Country;
    
    public Address(int st , String ci , String co)
    {
        Street_NO = st;
        City = ci;
        Country = co;
    }
    public void Display()
    {
        super.Display();
        System.out.println("Street Number : "+Street_NO +" \t|City : "+City +"\t|Country : "+Country);
    }
}