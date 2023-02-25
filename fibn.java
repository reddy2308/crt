package crt;
import java.util.*;

public class fibn {
	public static void main(String [] args)
	{
		int x,i,temp,count,fina;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of iterations");
		x=sc.nextInt();
		fibn h=new fibn();
		count=1;
		temp=0;
		System.out.println(temp);
		System.out.println(count);
		for(i=0;i<=x-2;i++)
		{
			fina=temp+count;
			System.out.println(fina);
			temp=count;
			count=fina;
		}
	}
}

