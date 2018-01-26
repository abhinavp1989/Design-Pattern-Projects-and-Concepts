package strategy;

import datastore.*;
public abstract class GasPumpedMsg{
   datastore dobj;
    public abstract void gasPumpedMsg();
    
    public void setdata(datastore dt)
    {
    	dobj=dt;
    }
}
