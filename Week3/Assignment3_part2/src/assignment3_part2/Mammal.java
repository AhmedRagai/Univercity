package assignment3_part2;
public class Mammal implements Animal
{
    private int Number_of_Legs;
    private String Favorite_Food ;
    private String fav [] ={"leaves" , "stems" , "roots" , "nuts"};
    
    @Override
    public void Eat() 
    {
        System.out.println("A mammal is eat Three times a day");
    }

    @Override
    public void Travel() 
    {
        System.out.println("A mammal is travel once in month");
    }
    
    public int NoOfLegs(int numlegs)
    {
        Number_of_Legs = numlegs;
        return Number_of_Legs;
    }
    public String FavFood(int i)
    {
        Favorite_Food = fav[i];
        return Favorite_Food;
    }
}