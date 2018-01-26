package inputpro;

import abstractfactory.af;
import datastore.*;
import mdaefsm.mda;
public class GP2
{
	af abfact_object;
	mda mda_object;
	datastore datastore_object;
	public void setMDA(mda x)
	{
		mda_object = x;
	}
	public void setdata(datastore x)
	{
		datastore_object = x;
	}
	public void setfactory(af x)
	{
		abfact_object = x;
	}
    public void Activate(int a,int b,int c)
    {
    	if(((a>0)&&(b>0))&&(c>0))
    	{
         datastore_object.setx(a);
         datastore_object.sety(b);
         datastore_object.setz(c);
         mda_object.Activate();
                      
    	}
    }
    public void Start()
    {
        mda_object.Start();
    }
    public void PayCash(float c)
	{
		
		if(c>0)
		{
			datastore_object.setcash(c);
			mda_object.PayCash();
		}

	}
    
    public void Cancel()
    {
        mda_object.Cancel();
    }
    
    public void Super()
    {
    	mda_object.SelectGas(2);
    }
    public void Premium()
    {
    	mda_object.SelectGas(3);
    }
    public void Regular()
    {
    	mda_object.SelectGas(1);
    }
     public void StartPump()
    {  
       mda_object.StartPump();
    }
     public void PumpLiter()
     {
     
     	float cash = datastore_object.getcash();
     	float price =datastore_object.getprice();
     	float L = datastore_object.getL();  	
     	if(cash<(L+1)*price)
     	{	System.out.println("Cannot Pump More");
     		mda_object.StopPump();
     	}
     	else
     	{
     		mda_object.Pump();
     	}
     } 
     
   
    public void StopPump()
    {
       mda_object.StopPump();       
    }
    public void Receipt()
    {
       mda_object.Receipt();       
    }
    public void NoReceipt()
    {
       mda_object.NoReceipt();       
    }
    
}
