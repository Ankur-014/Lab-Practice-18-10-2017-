package Air;



public class Aeroplane extends Air {
	
	public double speed()
	{
		System.out.println("My speed in air  : ");
		return 300;
	}
	public boolean isRunning()
	{
		System.out.println("I(Aeroplane) can run on air");
		return true;
	}
	
	public void AeroplaneFunction()
	{
		System.out.println("Hey, I am an Aeroplane");
	}
}
