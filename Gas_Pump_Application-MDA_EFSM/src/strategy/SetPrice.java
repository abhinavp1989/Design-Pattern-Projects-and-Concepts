package strategy;

import datastore.*;
public abstract class SetPrice
{
   datastore dobj;
    public abstract void setPrice(int g);
    public void setdata(datastore dt)
    {
       dobj=dt;
    }
}
