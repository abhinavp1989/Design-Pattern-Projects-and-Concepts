package strategy;

public class ReturnCash2 extends ReturnCash {
	
	@Override
    public void ReturnCashs()
    {
    	
    	float cash1=dobj.getcash();
    	float total=dobj.gettotal();
    	float cash_ret=cash1-total;
    	
      	System.out.printf("Cash Returned"+cash_ret);
      	
     
    }

}
