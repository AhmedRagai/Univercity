package faculty;
import java.util.*;
public class Faculty 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Pleas ,enter your member (assistant / doctor) : ");
        String member = input.nextLine();
        
        Member_Factory m = new Member_Factory();
        Staff s = m.Member(member);
        s.Get_Salary(15000);
        s.Get_Year_of_Work(3);
    }
    
}
