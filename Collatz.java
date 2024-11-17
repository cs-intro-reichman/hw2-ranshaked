// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int number  =Integer.parseInt( args[0]);
		String name = args[1];
		if(name.charAt(0) == 'v')
		{
		int i1 = 0;
		int i2 = 0;
		for(int i = 1 ; i < number + 1 ; i++)
		{
			i1 = i;
			i2 = i+1;
			System.out.print(i+ " ");
			int counter = 1;
			while(i2>1)
			{
				if(i1%2 ==0)
				{
					i1 = i1/2;
					System.out.print(i1 + " ");	
				}else{
					i1 = (i1*3)+1;
					System.out.print(i1 + " ");	
				}
				counter ++;
				i2 = i1;
			}
			System.out.print(" (" + counter + ")");
			System.out.println();	
		}
		System.out.println("Every one of the first " + number + " hailstone sequences reached 1.");
	}else{
		System.out.println("Every one of the first " + number + " hailstone sequences reached 1.");
	}
		
		
	}
	
}
