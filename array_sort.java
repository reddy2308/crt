package crt;
import java.util.*;
import java.lang.*;

public class array_sort {

	public static void main(String[] args) {
		int primes[]= {2,17,3,21,11};
		System.out.println("array before sorting:"+Arrays.toString(primes));
		Arrays.sort(primes);
		System.out.println("Arrays after sorting:"+Arrays.toString(primes));
		
		String[] fruits= {"apple","bananna","orange","grapes"};
		
		System.out.println("String array before sorting :"+Arrays.toString(fruits));
		System.out.println("string array in descending order:");
		Arrays.sort(fruits,Collections.reverseOrder());
		System.out.println("String array after sorting:"+Arrays.toString(fruits));
	}

}
