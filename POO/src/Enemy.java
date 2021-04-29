
public class Enemy extends Character implements Actions
{
	public Enemy(String name)
	{
		super.name = name;
		super.life = 10;
		super.armor = 5;
		super.atack = 3;
	}

	@Override
	public void walk() 
	{
		
	}

	@Override
	public void Atack(Object player) 
	{
		Player p1 = Player.class.cast(player); 
		System.out.println(this.name + " is atacking " + p1.name);
		p1.life--;
		System.out.println(p1.name + "'s life = " + p1.life + "\n");
	}

	@Override
	public void defend() 
	{

		
	}
}
