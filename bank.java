package crt;
interface bnk{
	float rateofintrest();
}
class sbi implements bnk
{
	public float rateofintrest() 
	{
		return 9.15f;
	}
}
class pnb implements bnk
{
	public float rateofintrest()
	{
		return 9.7f;
	}
}
public class bank 
{
	public static void main(String[]agrs)
	{
		bnk b=new sbi();
		System.out.println("ROI:"+b.rateofintrest()+"%");
		bnk c=new pnb();
		System.out.println("ROI:"+c.rateofintrest()+"%");
	}

}
