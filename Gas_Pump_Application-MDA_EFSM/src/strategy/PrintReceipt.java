package strategy;

import datastore.*;
public abstract class PrintReceipt {
    datastore dobj;
    public abstract void printReceipt();
    
    public void setdata(datastore dt)
    {
        dobj=dt;
    }
}
