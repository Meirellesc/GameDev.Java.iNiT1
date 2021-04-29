
public class Game 
{
	public static void main(String[] args)
	{
		Player player = new Player("paradox");
		player.PrintStatus();
		
		Enemy enemy = new Enemy("evil");
		enemy.PrintStatus();
		
		//ROUND 1
		System.out.println("<\n----------->");
		System.out.println("<--ROUND 1-->");
		System.out.println("<----------->\n");
		
		player.Atack(enemy);
		enemy.Atack(player);
		player.Atack(enemy);
		enemy.Atack(player);
		player.Atack(enemy);
		enemy.Atack(player);
		player.Atack(enemy);
		enemy.Atack(player);
		player.Atack(enemy);
	}
}
