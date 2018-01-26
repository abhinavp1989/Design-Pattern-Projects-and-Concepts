package strategy;

public class StoreData1 extends StoreData
{
    @Override
    public void storeData()
    {
    	float 	a, b;
        a=dobj.geta();
        dobj.setreg_price(a);
        b=dobj.getb();
        dobj.setsup_price(b);
       
    }
    
}