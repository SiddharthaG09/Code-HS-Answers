import java.util.Scanner;

public class Basketball
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // Start by listing the steps you need to take
        //Who cares
        
        System.out.println("Enter player one's name: ");
        String firstName = input.nextLine();
        System.out.println("Enter player two's name: ");
        String secondName = input.nextLine();
        System.out.println("Enter " + firstName + " score ");
        int firstScore = input.nextInt();
        System.out.println("Enter " + secondName + " score ");
        int secondScore = input.nextInt();
        if(firstName.compareTo(secondName)<0)
        {
            System.out.println(firstName + " scored " + firstScore + " points");
            System.out.println(secondName + " scored " + secondScore + " points");
        }
        else
        {
            System.out.println(secondName + " scored " + secondScore + " points");
            System.out.println(firstName + " scored " + firstScore + " points");
        }
        
        
        if(firstScore>secondScore)
        {
            System.out.println(firstName + " wins!");
        }
        else
        {
            System.out.println(secondName + " wins!");
        }
        
        
    }
}
