package crt;

import java.util.Scanner;

public class student{
public static void main(String[]args)
{
	String name;
	char a;
	int sub1,sub2,sub3;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your name:");
	name=sc.nextLine();
	System.out.println("enter your initial:");
	a=sc.next().charAt(0);
	System.out.println("Enter sub1 marks:");
	sub1=sc.nextInt();
	System.out.println("Enter sub2 marks:");
	sub2=sc.nextInt();
	System.out.println("Enter sub3 marks:");
	sub3=sc.nextInt();
	int total=sub1+sub2+sub3;
	float percent=(float)total/300*100;
	System.out.println(total);
	System.out.println(percent);
}
}