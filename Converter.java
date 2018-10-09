//Abhiramakrishnan thiyagarajan

public class Converter {


	private static double findLength(double T){
		double g = 9.8;
		double pi = 3.14159; 
		return g * T * T/(4 * pi * pi);
	} 

	private static double findCelcius(double F){
		return (F - 32 ) * 5/9;
	}


	
	public static void main(String [] args) {

		for(int ii = 0; ii < args.length; ii++)
		System.out.println(args[ii]);

	}
}

