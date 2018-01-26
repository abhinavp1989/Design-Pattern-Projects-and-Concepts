package strategy;

public class PumpGasUnit2 extends PumpGasUnit
{
	@Override
    public void pumpGasUnit()
    {
       int l=dobj.getL();
       l=l+1;
       float total;
       float price = dobj.getprice();
       total =price*l;
       dobj.setL(l);
       dobj.settotal(total);  
       
     }
    
}