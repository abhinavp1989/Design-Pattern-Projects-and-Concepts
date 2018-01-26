package abstractfactory;

import datastore.*;
import strategy.*;


public class cf2 extends af
{
     datastore2 datastore2_object= new datastore2();  //creates data1 object for ATM1
     
	 public PrintReceipt getPrintReceipt()
    {
		
		 PrintReceipt pr_o =new PrintReceipt2();
		 pr_o.setdata(datastore2_object);
		       
	        return pr_o;
    }
	 public StoreData getStoreData()
    {
		 StoreData sd_o =new StoreData2();
		 sd_o.setdata(datastore2_object);
		 return sd_o;
    }
	 public SetInitialValues getSetInitialValues()
    {
		 SetInitialValues siv_o = new SetInitialValues2();
		 siv_o.setdata(datastore2_object);
        return siv_o;
    }
	 public SetPrice getSetPrice()
    {
		 SetPrice sp_o = new SetPrice2();
		 sp_o.setdata(datastore2_object);
	        return sp_o;
    }
	 public StoreCash getStoreCash()
     {
		    StoreCash sc_o = new StoreCash2();
		    sc_o.setdata(datastore2_object);
	        return sc_o;
     }
	 public datastore getdata()
	 {
	        return datastore2_object;
	 }

	  public GasPumpedMsg getGasPumpedMsg()
	  {
		  GasPumpedMsg gpm_o = new GasPumpedMsg2();
	        gpm_o.setdata(datastore2_object);
	        return gpm_o;

	  }
	  public ReadyMsg getReadyMsg()
	  {
		   ReadyMsg rm_o = new ReadyMsg1();
	        rm_o.setdata(datastore2_object);
	        return rm_o;

	  }
	  public PayMsg getPayMsg()
	  { 
		  PayMsg pm_o = new PayMsg1();
          pm_o.setdata(datastore2_object);
          return pm_o;

	  }
	  public CancelMsg getCancelMsg()
	  {
		  CancelMsg cm_o = new CancelMsg1();
		  cm_o.setdata(datastore2_object);
          return cm_o;
	  }
	  public StopMsg getStopMsg()
	  {
		  StopMsg sm_o = new StopMsg1();
		  sm_o.setdata(datastore2_object);
          return sm_o;
	  }
	  public DisplayMenu getDisplayMenu()
	  {
		  DisplayMenu dm_o = new DisplayMenu2();
		  dm_o.setdata(datastore2_object);
          return dm_o;
	   }
	    public PumpGasUnit getPumpGasUnit()
	    {
	    	 PumpGasUnit pgu_o = new  PumpGasUnit2();
	    	 pgu_o.setdata(datastore2_object);
	          return pgu_o;
	    }
	    
	    public RejectMsg getRejectMsg()
	    {
	    	RejectMsg rm_o = new RejectMsg1();
	    	rm_o.setdata(datastore2_object);
	          return rm_o;
	    }
	   
	    public  NoReceipt getNoReceipt()
	    {
	    	NoReceipt nr_o = new NoReceipt2();
	    	nr_o.setdata(datastore2_object);
	          return nr_o;
	    }
	    public ReturnCash getReturnCash()
	    { 
	    		ReturnCash rm_o = new ReturnCash2();
	    		rm_o.setdata(datastore2_object);
	    		return rm_o;
	    }
	    
}
