
public abstract class Character 
{
	String name = "";
	
	int life = 0;
	
	int armor = 0;
	
	int atack = 0;
	
	public void PrintStatus()
	{
		String toString = 
				("\nName: " + this.name +
				"\nLife: " + this.life +
				"\nArmor: " + this.armor +
				"\nAtack: " + this.atack);
		
		System.out.println(toString);
	}
}
