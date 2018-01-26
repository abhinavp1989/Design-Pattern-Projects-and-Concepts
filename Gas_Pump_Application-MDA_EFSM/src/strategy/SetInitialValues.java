package strategy;

import datastore.*;
public abstract class SetInitialValues
{
	datastore dobj;
    public abstract void setInitialValues();
    public void setdata(datastore dt)
    {
        dobj=dt;
    }
}
