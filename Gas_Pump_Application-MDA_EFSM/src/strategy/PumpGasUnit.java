package strategy;

import datastore.*;
public abstract class PumpGasUnit
{
   datastore dobj;
    public abstract void pumpGasUnit();
    public void setdata(datastore dt)
    {
        dobj=dt;
    }
}
