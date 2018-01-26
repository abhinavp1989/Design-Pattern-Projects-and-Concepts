package strategy;

import datastore.*;
public abstract class StoreCash
{
    datastore dobj;
    public abstract void storeCash();
    public void setdata(datastore dt)
    {
        dobj=dt;
    }
}
