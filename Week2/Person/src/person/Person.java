package person;
public class Person 
{
    public static void main(String[] args) 
    {
        persone p =new persone("Ahmed", "Minya", "ahmed@gmail.com", 01001001);
        p.Display();
        
        Student s = new Student();
        s.Display();
        s.Junior();
        
        Employee e = new Employee("CS Department", "25/10/2021", 4500);
        e.Display();
        
        Faculty f = new Faculty(8,"Officer");
        f.Display();
        
        Staff st = new Staff("Dean");
        st.Display();
    }
}