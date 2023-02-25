package crt;

public class aryloops {
	public static void main(String[]args)
	{
		int[] primes = {2,3,5,7,11};
		for(int i=0;i<primes.length;i++)
		{
			System.out.printf("elements at index %d is %d"+"%n",i,primes[i]);
		}
		for(int prime:primes)
		{
			System.out.println("current number is:"+prime);
		}
	}
}
