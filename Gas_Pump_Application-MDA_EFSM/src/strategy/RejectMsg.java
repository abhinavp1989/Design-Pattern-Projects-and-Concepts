package strategy;

import datastore.*;
public abstract class RejectMsg
{
    datastore dobj;
    public abstract void rejectMsg();
    public void setdata(datastore dt)
    {
        dobj=dt;
    }
}
