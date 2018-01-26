package state;

import outputpro.OutputProcessor;

public class s4 extends s
{
	@Override
	public void Cancel()
    {
      OutputProcessor.cancelMsg();
      OutputProcessor.ReturnCash();
     
    }
	public void SelectGas(int g)
    {
      OutputProcessor.setPrice(g);
     
    }
    
}
