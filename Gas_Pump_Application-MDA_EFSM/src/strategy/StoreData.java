package strategy;

import datastore.*;
public abstract class StoreData
{
    datastore dobj;
    public abstract void storeData();
    public void setdata(datastore dt)
    {
        dobj=dt;
    }
}

