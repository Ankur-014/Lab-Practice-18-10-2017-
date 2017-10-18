package Water;

public class Boat extends Water {
	
	public double speed()
	{
		System.out.println("My speed in Water  : ");
		return 10;
	}
	public boolean isRunning()
	{
		System.out.println("I(Boat) can run on air");
		return true;
	}
	
	public void BoatFunction()
	{
		System.out.println("Hey, I am a Boat");
	}
}
