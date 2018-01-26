package datastore;

public class datastore2 extends datastore
{
	static int temp_a;
	static int temp_b;
	static int temp_c;
	static int L;
	static int reg_price;
	static int pre_price;
	static int sup_price;
	static float cash;
	static float total;
	static int price;
	
	public float getprice()
	{
		  return price;
	}
	 public void setprice(float y)
	{
			price=(int)y;
			
			
	}
	 public void setx(int a)
	{
		temp_a =a;
	}
	public void sety(int b)
	{
		temp_b=b;
	}
	public int gety()
	{
		return temp_b;
	}
	public int getx()
	{
		return temp_a;
	}
	public void setz(int a)
	{
		 temp_c =a;
	}
	public int getz()
	{
		  return temp_c;
	}
	public void setL(int a)
	{
		    L=a;
	}
	public int getL()
	{
		   return L;
	}
	 public void setpre_price(int a)
	{
			pre_price=a;
	}
	public int getpre_price()
	{
		  return pre_price;
	}
	public void setreg_price(float a)
	{
			reg_price=(int)a;
			
	}
	public float getreg_price()
	{
		  return reg_price;
	}
	 public void setsup_price(float a)
	{
		 sup_price=(int)a;
	}
	public float getsup_price()
	{
		  return sup_price;
    }
	public void setcash(float a)
	{
			cash=a;
	}
	public float getcash()
	{
		return cash;
	}
	public float gettotal()
	{
		return total;
	}
	public void settotal(float a)
	{
			total=a;
	}
	
}	
