package strategy;

import datastore.*;
public abstract class NoReceipt
{
	datastore dobj;
    public abstract void noReceipt();
    
    public void setdata(datastore dt)
    {
    	dobj=dt;
    }
}