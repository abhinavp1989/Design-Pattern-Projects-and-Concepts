package strategy;

import datastore.*;
public abstract class CancelMsg
{
    datastore dobj;
    public abstract void cancelMsg();
    public void setdata(datastore dt)
    {
        dobj=dt;
    }
}
