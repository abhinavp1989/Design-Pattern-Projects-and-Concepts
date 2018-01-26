//Creation of abstract factory 1,datastore data and MDA
//Gas Pump 1 list of functions is provided

package inputpro;
import abstractfactory.af;
import datastore.*;
import mdaefsm.mda;

public class GP1
{	
	af abfact_object;
	mda mda_object;
	datastore datastore_object;
	public void setMDA(mda m)
	{
		mda_object = m;
	}
	public void setdata(datastore d)
	{
		datastore_object = d;
	}
	public void setfactory(af f)
	{
		abfact_object = f;
	}
	public void Activate(float a,float b)
	{
		if(a>0 && b>0)
		{
			datastore_object.seta(a);
			datastore_object.setb(b);
			mda_object.Activate();
		}
                
	}
	public void Start()
	{
		mda_object.Start();
          
	}
	public void PayCredit()
	{
		mda_object.PayCredit();
	}
	public void Reject()
	{
		mda_object.Reject();
	}
	public void Cancel()
	{
		mda_object.Cancel();
	}

	public void Approved()
	{
		mda_object.Approved();
 
	}
	
	public void Super()
    {
	    mda_object.SelectGas(2);
	}
	
    public void Regular()
    {
	    mda_object.SelectGas(1);
	}
    
    public void StartPump()
    {  
       mda_object.StartPump();
    }
    
	public void PumpGallon()
	{	
		mda_object.Pump();
	}
	public void StopPump()
	{
		mda_object.StopPump();
		mda_object.Receipt();
			
	}

}






