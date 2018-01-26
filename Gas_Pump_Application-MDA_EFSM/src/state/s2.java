package state;

import outputpro.OutputProcessor;
public class s2 extends s
{
	@Override
    public void PayCash()
    {
     OutputProcessor.storeCash();
     OutputProcessor.displayMenu();
     }
	public void PayCredit()
    {
		
     OutputProcessor.PayCredit();
    
     }
}

