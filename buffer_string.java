package crt;

public class buffer_string {

	public static void main(String[] args) {
		String str="Phani";
		str.concat("Srikanth");
		System.out.println(str);
		
		StringBuffer strb=new StringBuffer("hello");
		strb.append("world");
		System.out.println(strb);
	}
}
