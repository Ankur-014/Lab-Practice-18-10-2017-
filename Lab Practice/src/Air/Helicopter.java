package Air;

public class Helicopter extends Air {
	
	public double speed()
	{
		System.out.println("My speed in air  : ");
		return 200;
	}
	public boolean isRunning()
	{
		System.out.println("I(Helicopter) can run on air");
		return true;
	}
	
	public void HelicopterFunction()
	{
		System.out.println("Hey, I am a Helicopter");
	}
}
