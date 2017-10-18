package Land;

public class Car extends Land {
	public double speed()
	{
		System.out.println("My speed in Land  : ");
		return 100;
	}
	public boolean isRunning()
	{
		System.out.println("I(Car) can run on Land");
		return true;
	}
	
	public void CarFunction(){
		System.out.println("Hey I am a Car");
	}
	
}
