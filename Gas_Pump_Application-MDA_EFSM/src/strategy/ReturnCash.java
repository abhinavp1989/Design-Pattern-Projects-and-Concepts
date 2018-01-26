package strategy;

import datastore.*;
public abstract class ReturnCash {
    datastore dobj;
    
    public abstract void ReturnCashs();
    
    public void setdata(datastore dt)
    {
        dobj=dt;
    }
}
