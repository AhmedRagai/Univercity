package faculty;
public class Member_Factory 
{
    public Staff Member(String position)
    {
        String s = position.toLowerCase();
        switch (s)
        {
            case "assistant":
                return new Teaching_Assistant();
                
            case "doctor":
                return new Doctor();
                
            default:
                return null;
        }
    }
    
}
