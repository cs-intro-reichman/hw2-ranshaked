// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) 
	{ 
		double numOperations = Integer.parseInt(args[0]);
	    double pi = Math.PI;
		System.out.println("pi according to java: " +pi);
		double piMe = 0.0;
		double i = 0.0;
		while(numOperations>0)
		{
			 i = 1/((2*numOperations)-1);
			if(numOperations%2 == 0)
			{
				piMe = piMe - i;
			}else{
				piMe = piMe + i; 
			}
			numOperations--;
		}
		System.out.println("pi, approximated:     " + piMe*4);
	}
}
