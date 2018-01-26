package outputpro;
import datastore.*;
import abstractfactory.*;
import outputpro.OutputProcessor;
import strategy.*;


public class OutputProcessor
{
		static af abfact_object;
	   datastore datastore_object;
	   public void setfactory(af af1)
	    {
	        abfact_object=af1;
	    }
	    public void setData(datastore d1)
	    {
	        datastore_object=d1;
	    }
	    public static void storeData()
	    {

		   StoreData object;
		   object=abfact_object.getStoreData();
		   object.storeData();
		   
	    }
	    public static void displayMenu()
	    {
	    	DisplayMenu object;
	    	object=abfact_object.getDisplayMenu();
	    	object.displayMenu();
	    }
	    public static void payMsg() 
	    {
	    	PayMsg object;
	    	object=abfact_object.getPayMsg();
	    	object.payMsg();
	    }
	    public static void PayCredit() 
	    {
	    	System.out.println("Credit Card Authentication");
	    	
	    }
	    public static void rejectMsg()
	    {
	    	RejectMsg object;
	    	object=abfact_object.getRejectMsg();
	    	object.rejectMsg();
	    }
	    public static void printReceipt()
	    {
	    	PrintReceipt object;
	    	object=abfact_object.getPrintReceipt();
	    	object.printReceipt();
	     }    
	    public static void cancelMsg()
	    {
	    	CancelMsg object;
	    	object=abfact_object.getCancelMsg();
	    	object.cancelMsg();
	    }
	   public static void storeCash()
	    {
	    	StoreCash object;
	    	object=abfact_object.getStoreCash();
	    	object.storeCash();
	        
	    }
	   public static void gasPumpedMsg()
	    {
	    	GasPumpedMsg object;
	    	object=abfact_object.getGasPumpedMsg();
	    	object.gasPumpedMsg();
	    }
	     public static void pumpGasUnit()
	    {
	    	    PumpGasUnit object;
		    	object=abfact_object.getPumpGasUnit();
		    	object.pumpGasUnit();
	    }

	    public static void readyMsg()
	    {
	    	ReadyMsg object;
	    	object=abfact_object.getReadyMsg();
	    	object.readyMsg();
	    }
	    public static void stopMsg()
	    {
	    	StopMsg object;
	    	object=abfact_object.getStopMsg();
	    	object.stopMsg();
	    }
	    
	    public static void setPrice(int g)
	    {
	    	SetPrice object;
	    	object=abfact_object.getSetPrice();
	    	object.setPrice(g);
	    }
	    public static void setInitialValues()
	    {

	    	SetInitialValues object;
	    	object=abfact_object.getSetInitialValues();
	    	object.setInitialValues();
	    }
	   
	    public static void NoReceipt()
	    {

	    	NoReceipt object;
	    	object=abfact_object.getNoReceipt();
	    	object.noReceipt();
	    }
	    public static void ReturnCash()
	    {

	    	ReturnCash object;
	    	object=abfact_object.getReturnCash();
	    	object.ReturnCashs();
	    }
	    
	
}