package strategy;

import datastore.*;
public abstract class DisplayMenu
{
  datastore dobj;
  public abstract void displayMenu();
  public void setdata(datastore dt)
    {
        dobj=dt;
    }
}

