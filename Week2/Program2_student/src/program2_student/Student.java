package program2_student;
public class Student 
{
    private String St_Name;
    private int St_ID;
    private float St_GPA;
    
    public Student()
    {
        
    }
    public Student(String name , int id , float gpa)
    {
        St_Name = name;
        St_ID = id;
        St_GPA = gpa;
    }
    
    public void set_Name(String name)
    {
        St_Name = name;
    }
    public void set_ID(int id)
    {
        St_ID = id; 
    }
    public void set_GPA(float gpa)
    {
        St_GPA = gpa;
    }
    
    public String get_Name()
    {
        return St_Name;
    }
    public int get_ID()
    {
        return St_ID; 
    }
    public float get_GPA()
    {
        return St_GPA;
    }
    
    public void Display()
    {
        System.out.println("Student Name : "+St_Name +" \t|Student ID : "+St_ID +"\t|Student GPA : "+St_GPA);
    }
}