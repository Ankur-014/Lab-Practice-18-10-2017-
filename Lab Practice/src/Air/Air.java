package Air;

import Vehicle.Vehicle;

public class Air implements Vehicle{

	@Override
	public double speed()
	{
		System.out.println("Speed is: ");
		return 50.26;
	}
	

	@Override
	public boolean isRunning() {
		return true;
	}
}
