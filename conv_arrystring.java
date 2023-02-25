package crt;

import java.util.Arrays;

class conv{
	String arrayToString(String[] currencies,String delimeter) {
		String result="";
		if(currencies.length>0)
		{
			StringBuilder ab= new StringBuilder();
			for(String s:currencies)
			{
				ab.append(s).append(delimeter);
			}
			result=ab.deleteCharAt(ab.length()-1).toString();
		}
		return result;
	}
}

public class conv_arrystring {
	public static void main(String [] mains)
	{
		String[] currencies= {"USD","INR","AUD","GBF"};
		conv c=new conv();
		System.out.println("array is:"+Arrays.toString(currencies));
		String output=c.arrayToString(currencies,".");
		System.out.println(output);
	}

}
