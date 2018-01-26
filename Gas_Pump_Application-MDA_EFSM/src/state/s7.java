package state;

import outputpro.OutputProcessor;
public class s7 extends s
{
	@Override
    public void Receipt()
    {
     OutputProcessor.printReceipt();
     
     
    }
	public void NoReceipt()
    {
     OutputProcessor.NoReceipt();
     OutputProcessor.ReturnCash();
     
    }
}
