package Land;


public class Bus extends Land {
	public double speed()
	{
		System.out.println("My speed in Land  : ");
		return 30;
	}
	public boolean isRunning()
	{
		System.out.println("I(Bus) can run on Land");
		return true;
	}
	
	public void BusFunction()
	{
		System.out.println("Hey, I am a Bus");
	}
}
