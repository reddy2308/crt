package crt;
import java.util.*;
abstract class std
{
	abstract void std1();
}

class details extends std
{
	void std1(){
		String name="praveen";
		int marks=100;
		System.out.print(name+"\n"+marks);
	}
}

public class abstrac
{
	public static void main(String[]args)
	{
		std s=new details();
		s.std1();
	}
}