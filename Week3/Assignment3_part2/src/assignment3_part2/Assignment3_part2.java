package assignment3_part2;
public class Assignment3_part2 
{
    public static void main(String[] args) 
    {
        Mammal m = new Mammal();
        m.Eat();
        System.out.println("The Favorite food of a mammel : "+m.FavFood(2));
        System.out.println("The number of legs of a mammel = "+m.NoOfLegs(4));
        m.Travel();
    }
    
}
