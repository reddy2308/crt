package crt;
import java.util.*;

public class swi {
	enum course
	{
		AI,ML,WD
	}
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		course[] presentcourse=course.values();
		for(course c:presentcourse)
		{
			switch(c)
			{
			case AI:
				System.out.println("the ful form of AI is Artificial Intelligence");
				break;
			case ML:
				System.out.println("The full form of ML is Machine Learning");
				break;
			case WD:
				System.out.println("the full form of WD is Web Development");
				break;
			}
		}
	}
}
