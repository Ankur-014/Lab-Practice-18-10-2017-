package Water;

public class Ship extends Water {
	
	public double speed()
	{
		System.out.println("My speed in Water  : ");
		return 34;
	}
	public boolean isRunning()
	{
		System.out.println("I(Ship) can run on Water");
		return true;
	}
	
	public void ShipFunction()
	{
		System.out.println("Hey, I am a Ship");
	}
}
