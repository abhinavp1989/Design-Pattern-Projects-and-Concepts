package datastore;

public class datastore1 extends datastore {


	static float temp_a;
	static float temp_b;
	static float price;
	static float total;
	static float G;
	static float reg_price;
	static float sup_price;
	
	public void seta(float a)
	{
		temp_a =a;
	}
	public void setb(float b)
	{
		temp_b=b;
	}
	public float geta()
	{
		return temp_a;
	}
	public float getb()
	{
		return temp_b;
	}

	public void settotal(float c)
	{
		 total =c;
	}
	public float gettotal()
	{
		return total;
	}

    public void setG(float y)
	{
	    G=y;
	}
    public float getG()
	{
	    return G;
	}
    public void setprice(float y)
	{
		price=y;
	}
    public float getprice()
	{
	  return price;
	}
    public void setsup_price(float y)
	{
		sup_price=y;
	}
    public float getsup_price()
	{
	  return sup_price;
	}
    public void setreg_price(float y)
	{
		reg_price=y;
	}
    public float getreg_price()
	{
	  return reg_price;
	}
   
}
