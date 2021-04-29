import java.util.ArrayList;

public class Game implements Runnable 
{
	private boolean isRunning;
	
	private Thread thread;
	
	private ArrayList<Entity> entities = new ArrayList<>(); 
	
	public Game()
	{
		entities.add(new Entity());
		entities.add(new Entity());
		entities.add(new Entity());
	}
	
	/*
	 * Initialize the Game Loop
	 */
	public synchronized void Start()
	{
		isRunning = true;
		thread = new Thread(this);
		thread.setName("GameLoop");
		thread.start();
	}
	
	/*
	 * Update the Game
	 */
	public void Tick()
	{
		System.out.println("Tick");
	}

	/*
	 * Renders the Game
	 */
	public void Render()
	{
		System.out.println("Render");
	}
	
	/*
	 * Game Loop
	 */
	@Override
	public void run() 
	{
		System.out.println("Game Initialized");
		while(isRunning)
		{
			Tick();
			Render();
			
			//One way to set the "FPS"
			/*
			try
			{
				Thread.sleep(5000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}*/
		}
	}

}
