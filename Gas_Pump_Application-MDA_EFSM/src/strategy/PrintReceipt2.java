package strategy;

public class PrintReceipt2 extends PrintReceipt
{
	@Override
    public void printReceipt()
	{
    	float total = dobj.gettotal();
    	int L=(int)dobj.getL();
    	float cash1=dobj.getcash();
    	float cash_returned=cash1-total;
    	
    	System.out.printf("\n Receipt");
      	System.out.printf("\nTotal Amount paid"+total);
      	System.out.printf("\nGallons of gas pumped"+L);
      	System.out.printf("\nCash Returned"+cash_returned);
     
    }
    
}
