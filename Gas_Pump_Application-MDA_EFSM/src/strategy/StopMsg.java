package strategy;

import datastore.*;
public abstract class StopMsg
{
    datastore dobj;
    public abstract void stopMsg();
    public void setdata(datastore dt)
    {
        dobj=dt;
    }
}