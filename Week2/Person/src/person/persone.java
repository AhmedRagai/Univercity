package person;
public class persone 
{
    private String Name;
    private String Address;
    private String E_mail;
    private int Phone_Number;
    
    public persone()
    {
    }
    public persone(String name , String adr , String e_mail , int ph)
    {
        Name = name;
        Address = adr;
        E_mail = e_mail;
        Phone_Number = ph;
    }
    
    public void set_Name(String name)
    {
        Name = name;
    }
    public void set_Address(String adr)
    {
        Address = adr;
    }
    public void set_E_mail(String e_mail)
    {
        E_mail = e_mail;
    }
    public void set_Phone(int ph)
    {
        Phone_Number = ph;
    }
    
    public String get_Name()
    {
        return Name;
    }
    public String get_Address()
    {
        return Address;
    }
    public String get_E_mail()
    {
        return E_mail;
    }
    public int get_Phone()
    {
        return Phone_Number;
    }
    
    public void Display()
    {
        System.out.println("Name : "+Name +" \t|Address : "+Address +" \t|E_mail : "+E_mail +" \t|The Phone number : "+Phone_Number);
    }
}