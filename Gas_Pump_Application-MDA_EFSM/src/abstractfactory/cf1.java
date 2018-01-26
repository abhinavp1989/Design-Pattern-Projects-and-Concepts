package abstractfactory;

import datastore.*;
import strategy.*;




public class cf1 extends af
{
     datastore1 datastore1_object= new datastore1();  
	 
	 public StoreData getStoreData()
    {
		 StoreData sd_o =new StoreData1();
		 sd_o.setdata(datastore1_object);
		 return sd_o;
    }
	 public SetInitialValues getSetInitialValues()
    {
		 SetInitialValues siv_o = new SetInitialValues1();
        siv_o.setdata(datastore1_object);
        return siv_o;
    }
	 public SetPrice getSetPrice()
    {
		 SetPrice sp_o = new SetPrice1();
	        sp_o.setdata(datastore1_object);
	        return sp_o;
    }
	 public StoreCash getStoreCash()
     {
		  StoreCash sc_o = new StoreCash1();
	        sc_o.setdata(datastore1_object);
	        return sc_o;
		 
     }
	 public datastore getdata()
	 {
	        return datastore1_object;
	 }

	  public GasPumpedMsg getGasPumpedMsg()
    {
		  GasPumpedMsg gpm_o = new GasPumpedMsg1();
	        gpm_o.setdata(datastore1_object);
	        return gpm_o;

    }
	  public ReadyMsg getReadyMsg()
    {
		   ReadyMsg rm_o = new ReadyMsg1();
	        rm_o.setdata(datastore1_object);
	        return rm_o;

    }
	  public PayMsg getPayMsg()
    { 
		  PayMsg pm_o = new PayMsg1();
          pm_o.setdata(datastore1_object);
          return pm_o;

    }
	  public CancelMsg getCancelMsg()
	  {
		  CancelMsg cm_o = new CancelMsg1();
          cm_o.setdata(datastore1_object);
          return cm_o;
	  }
	  public StopMsg getStopMsg()
	  {
		  StopMsg sm_o = new StopMsg1();
          sm_o.setdata(datastore1_object);
          return sm_o;
	  }
	  public DisplayMenu getDisplayMenu()
	    {
		  DisplayMenu dm_o = new DisplayMenu1();
          dm_o.setdata(datastore1_object);
          return dm_o;
	    }
	    public PumpGasUnit getPumpGasUnit()
	    {
	    	 PumpGasUnit pgu_o = new  PumpGasUnit1();
	          pgu_o.setdata(datastore1_object);
	          return pgu_o;
	    }
	    
	    public RejectMsg getRejectMsg()
	    {
	    	RejectMsg rm_o = new RejectMsg1();
	          rm_o.setdata(datastore1_object);
	          return rm_o;
	    }
	    
	 
	    public PrintReceipt getPrintReceipt()
	    {
			
			 PrintReceipt pr =new PrintReceipt1();
			 pr.setdata(datastore1_object);
		        return pr;
	    }
	    public NoReceipt getNoReceipt()
	    {
	    	NoReceipt rm_o = new NoReceipt1();
	         rm_o.setdata(datastore1_object);
	          //return rm_o;
	    	return rm_o;
	    }
	    public ReturnCash getReturnCash()
	    { 
	    		ReturnCash rm_o = new ReturnCash1();
	    		rm_o.setdata(datastore1_object);
	    		return rm_o;
	    }
	    
	    
}
