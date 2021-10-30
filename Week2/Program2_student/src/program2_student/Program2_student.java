package program2_student;
public class Program2_student {
    public static void main(String[] args) 
    {
        Student s1 = new Student("Ahmed", 1,(float) 3.1);
        s1.Display();
        
        Subject ss = new Subject("Software Development", 503, 3);
        ss.Display();
        
        Address a = new Address(24, "Minya", "Egypt");
        a.Display();
    }
}
