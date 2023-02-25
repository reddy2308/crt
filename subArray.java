package crt;

import java.util.Arrays;

public class subArray 
{
	public static void main(String[] args) 
	{
		String[] creditcard= {"ICICI","SBI","CITY BANK","PNB","ANDHRA BANK"};
		String[] sbi=new String[2];
		System.arraycopy(creditcard, 1, sbi, 0, 2);
		System.out.println("original array:"+Arrays.toString(creditcard));
		System.out.println("sub array:"+Arrays.toString(sbi));
	}

}
