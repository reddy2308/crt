package crt;
import java.util.*;

public class pali {
	public static void main(String[]args)
	{
		int temp,n,r,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value\n");
		n=sc.nextInt();
		temp=n;
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println("given "+temp+" is palindrome");
		}
		else
		{
			System.out.println("given "+temp+" is not palindrome");
		}
	}

}
