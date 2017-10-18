package VariadicClass;

public class Variadic {
	
	public double CalculateAverage(double ...num){
		
		double sum = 0.0;
		for (double d : num) {
			sum += d; 
		}
		double av = sum/num.length;
		return av;
	}
	
}
