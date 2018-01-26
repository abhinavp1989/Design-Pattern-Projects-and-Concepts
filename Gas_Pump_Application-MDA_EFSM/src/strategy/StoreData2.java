package strategy;

public class StoreData2 extends StoreData
{
	@Override
    public void storeData()
    {
      int a, b, c;
      a=dobj.getx();
      
      dobj.setreg_price(a);
      b=dobj.gety();
      dobj.setsup_price(b);
      c=dobj.getz();
      dobj.setpre_price(c);  
    }
    
}