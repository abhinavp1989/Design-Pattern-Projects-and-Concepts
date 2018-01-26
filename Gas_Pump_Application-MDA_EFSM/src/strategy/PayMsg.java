package strategy;

import datastore.*;
public abstract class PayMsg
{
    datastore dobj;
    public abstract void payMsg();
    
    public void setdata(datastore dt)
    {
    	dobj=dt;
    }
}

