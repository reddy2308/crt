package crt;
import java.util.*;

class Student
{
	int rollno;
	String name,address;
	public Student(int rollno,String name,String address)
	{
		this.rollno=rollno;
		this.name=name;
		this.address=address;
	}
	public String toString()
	{
		return this.rollno+" "+this.name+" "+this.address+" ";
	}
}
class Sortbyroll implements Comparator<Student>
{
	public int compare(Student a,Student b)
	{
		return a.rollno-b.rollno;
	}
}
public class comparator_sort
{
	public static void main(String[] args)
	{
		Student[] arr= {new Student(111,"bbb","london"),new Student(131,"aaa","nyc"),new Student(121,"cccc","jaipur")};
		System.out.println("unsorted");
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		Arrays.sort(arr,new Sortbyroll());
		System.out.println("\nsorted by roll no");
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}

}
