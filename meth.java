package crt;

public class meth {
	public static void main(String[]args)
	{
		StringBuffer str=new StringBuffer("test");
		StringBuffer str1=new StringBuffer("test");
		StringBuffer str2=new StringBuffer("Hello Java");
		str.insert(0, 123);
		str1.reverse();
		str2.replace(6, 10,"World");
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str2.capacity());
		System.out.println(str2.length());
	}
}