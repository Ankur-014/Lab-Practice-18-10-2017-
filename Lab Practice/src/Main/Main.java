package Main;

import Air.Aeroplane;
import Air.Helicopter;
import Land.Bus;
import Land.Car;
import VariadicClass.Variadic;
import Water.Boat;
import Water.Ship;



public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Code for Variadic Function
		Variadic var = new Variadic();
		System.out.println("The average is: "+var.CalculateAverage(23.5,21.4,21.4));
		System.out.println("The average is: "+var.CalculateAverage(23.5,21.4,21.4,45,5,3));
	

	//Polymorphism
	Car ob1 = new Car();
	Bus ob2 = new Bus();
	Ship ob3 = new Ship();
	Boat ob4 = new Boat();
	Aeroplane ob5 = new Aeroplane();
	Helicopter ob6 = new Helicopter();
	
	
	Work obb = new Work();
	
	obb.doSomething(ob1);
	obb.doSomething(ob2);
	obb.doSomething(ob3);
	obb.doSomething(ob4);
	obb.doSomething(ob5);
	obb.doSomething(ob6);
	}
	
}
