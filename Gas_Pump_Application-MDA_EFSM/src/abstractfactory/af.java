package abstractfactory;

import strategy.*;


public abstract class af 
{
    
    public abstract StoreData getStoreData();
    public abstract PayMsg getPayMsg();
    public abstract StoreCash getStoreCash();
    public abstract DisplayMenu getDisplayMenu();
    public abstract RejectMsg getRejectMsg();
    public abstract CancelMsg getCancelMsg();
    public abstract SetPrice getSetPrice();
    public abstract ReadyMsg getReadyMsg();
    public abstract SetInitialValues getSetInitialValues();
    public abstract PumpGasUnit getPumpGasUnit();
    public abstract GasPumpedMsg getGasPumpedMsg();
    public abstract StopMsg getStopMsg();
    public abstract PrintReceipt getPrintReceipt();
    public abstract ReturnCash getReturnCash();
    public abstract NoReceipt getNoReceipt(); 
    
}