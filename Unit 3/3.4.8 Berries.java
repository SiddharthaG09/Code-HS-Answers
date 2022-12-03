import java.util.Scanner;

public class Berries
{
    public static void main(String[] args)
    {
        // Ask for a berry 
        Scanner input = new Scanner(System.in);
        // Remember the Scanner object will take whole strings
        System.out.println("Enter the initial of the berry: ");
        String berryLetter = input.nextLine();
        char letter = berryLetter.charAt(0);
        // Extract the first character using charAt
        // Remember that characters can be compared using == 
        if(letter == 'E')
        {
            System.out.println("You ordered Elderberry");
        }
        else if(letter=='G')
        {
            System.out.println("You ordered Gooseberry");
        }
        else if(letter=='L')
        {
            System.out.println("You ordered Lingonberry");
        }
        else
        {
            System.out.println("Berry not recognized");
        }
        // Use comments to list the different
        // branches you will need before you write the code
    }
}
