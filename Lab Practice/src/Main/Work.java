package Main;

import Air.Aeroplane;
import Air.Helicopter;
import Land.Bus;
import Land.Car;
import Vehicle.Vehicle;
import Water.Boat;
import Water.Ship;

public class Work {
			
	public void doSomething(Vehicle ob)
		{
			if (ob instanceof Car)
			{
				Car object = (Car) ob;
				object.CarFunction();
			}
			else if (ob instanceof Bus)
			{
				Bus object = (Bus) ob;
				object.BusFunction();
			}
			else if (ob instanceof Ship)
			{
				Ship object = (Ship) ob;
				object.ShipFunction();
			}
			else if (ob instanceof Boat)
			{
				Boat object = (Boat) ob;
				object.BoatFunction();
			}
			else if (ob instanceof Aeroplane)
			{
				Aeroplane object = (Aeroplane) ob;
				object.AeroplaneFunction();
			}
			else if (ob instanceof Helicopter)
			{
				Helicopter object = (Helicopter) ob;
				object.HelicopterFunction();
			}
				
			
		}
}
	