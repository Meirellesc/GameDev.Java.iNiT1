import java.util.Random;
import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Welcome to GuessNumber Game! \n\nPlease, input your name: ");
		
		
		//Player
		String playerName = input.nextLine();
		
		System.out.println("\n    <--Welcome " + playerName + "--> \n");
		
		
		//Random Number
		Random random = new Random();
		int randomNumber = random.nextInt(100);
		
		//Game
		boolean win = false;
		String playerInput;
		
		while(!win)
		{
			try
			{
				System.out.print("Guess a number: ");
				
				//Read the player's input
				playerInput = input.nextLine();

				//Convert to int
				int converted = Integer.parseInt(playerInput);
				
				//Check
				if(converted == randomNumber)
				{
					System.out.println("<------------------------->");
					System.out.println("<--Congratz... You Won!!-->");
					System.out.println("<------------------------->");
					win = true;
					break;
				}
				else if(converted < randomNumber)
				{
					System.out.println("Hmmm...Try a higher number :P");
				}
				else
				{
					System.out.println("So close...Try a minor number :D");
				}
			}
			catch(Exception ex)
			{
				System.out.println("Please, enter a valid number! [" + ex.getMessage() + "]");
			}
		}
		
	}
}
