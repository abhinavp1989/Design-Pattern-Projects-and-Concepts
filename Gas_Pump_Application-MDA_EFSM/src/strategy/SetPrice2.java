package strategy;

public class SetPrice2 extends SetPrice
{
	@Override
    public void setPrice(int g)
    {
		int a=(int)(dobj.getreg_price());
        int c=dobj.getpre_price();
        int b=(int)(dobj.getsup_price());
        if( g== 1)
        {
        	
        	dobj.setprice((float)a);
        
        }else if (g == 2)
        dobj.setprice(b);
        else if(g==3)
        dobj.setprice(c);
    }
    
}
