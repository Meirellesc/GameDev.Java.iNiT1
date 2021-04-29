
public class Player extends Character implements Actions
{
	public Player(String name)
	{
		super.name = name;
		super.life = 100;
		super.armor = 10;
		super.atack = 5;
		System.out.println("Player Initialized!");
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Atack(Object enemy) 
	{
		Enemy e1 = Enemy.class.cast(enemy); 
		System.out.println(this.name + " is atacking " + e1.name);
		e1.life--;
		System.out.println(e1.name + "'s life = " + e1.life + "\n");
	}

	@Override
	public void defend() {
		// TODO Auto-generated method stub
		
	}


}
