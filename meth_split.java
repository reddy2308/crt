package crt;

public class meth_split
{
	public static void main(String[]args)
	{
		String a=" example of the split words method";
		System.out.println("returning the words");
		for(String w:a.split("\\s",0))
		{
			System.out.println(w+"\n"); 
		}
		System.out.println("returning the words");
		for(String w:a.split("\\s",1))
		{
			System.out.println(w+"\n"); 
		}
		System.out.println("returning the words");
		for(String w:a.split("\\s",2))
		{
			System.out.println(w+"\n"); 
		}
		System.out.println("returning the words");
		for(String w:a.split("\\s",3))
		{
			System.out.println(w+"\n"); 
		}
	}
}
