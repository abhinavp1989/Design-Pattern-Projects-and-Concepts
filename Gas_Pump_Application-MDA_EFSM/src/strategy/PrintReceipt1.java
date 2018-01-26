package strategy;

public class PrintReceipt1 extends PrintReceipt
{
	@Override
    public void printReceipt()
    {
    	float total = dobj.gettotal();
    	float G=dobj.getG();
    	System.out.printf("\n Receipt");
      	System.out.printf("\nTotal Amount paid"+total);
      	System.out.printf("\nGallons of gas pumped"+G);
     
    }
    
}
