package crt;
import java.util.*;

public class fib {
	void add(int x,int y)
	{
		System.out.println("Addition of two numbers is:"+ x+y);
	}
	void sub(int x,int y)
	{
		System.out.println("Subntraction of two numbers is:"+(x-y));
	}
	void mul(int x,int y)
	{
		System.out.println("Multiplication of two numbers is:"+  x*y);
	}
	void div(int x,int y)
	{
		System.out.println("Division of two numbers is:"+ x/y);
	}
	public static void main(String [] args)
	{
		int a;
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
			int b , c ,ch;
			System.out.println("Enter the first value:");
			b=sc.nextInt();
			System.out.println("Enter the second value:");
			c=sc.nextInt();
			System.out.println("Enter the operation:\n 1.addition \n 2.subtraction \n 3.multiplication \n 4.divition\n 5.Exit \n");
			a=sc.nextInt();
			fib k=new fib();
		switch(a)
		{
		case 1 :{
			k.add(b, c);
			break;
		}
		case 2 :
		{
			k.sub(b, c);
			break;
		}
		case 3 :
		{
			k.mul(b, c);
			break;
		}
		case 4 :
		{
	
			k.div(b, c);
			break;
		}
		case 5 :
		{
			System.out.println("Exiting........");
			System.exit(0);
			break;
		}
		default :
		{
			System.out.println("Enter correct option\n");
		}
		}
		}
	}
}
