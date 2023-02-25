package crt;

class cwrap{  
private int i;  
cwrap(){}  
cwrap(int i){  
this.i=i;  
}  
public int getValue(){  
return i;  
}  
public void setValue(int i){  
this.i=i;  
}  
@Override  
public String toString() {  
  return Integer.toString(i);  
}  
}   
public class custom_wrap{  
public static void main(String[] args){  
	cwrap j=new cwrap(10);  
	System.out.println(j);  
}
}  