// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) 
	{ 
		double numOperations = Integer.parseInt(args[0]);
	    double pi = Math.PI;
		System.out.println("pi according to Java: " +pi);
		double piMe = 1.0;
		for(int i = 2 ; i <= numOperations ; i++)
		{
			double num1 = (i*2)-1;
			if(i%2 == 0)
			{
				piMe = piMe - (1/num1);
			}else{
				piMe = piMe + (1/num1);
			}
		}
		System.out.println("pi, approximated:     " + piMe*4);
	}
}//