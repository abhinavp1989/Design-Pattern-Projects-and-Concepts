package strategy;

import datastore.*;
public abstract class ReadyMsg
{
    datastore dobj;
    public abstract void readyMsg();
    public void setdata(datastore dt)
    {
        dobj=dt;
    }
}
