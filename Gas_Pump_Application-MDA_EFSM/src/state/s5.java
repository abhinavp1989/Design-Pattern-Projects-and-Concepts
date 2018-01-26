package state;

import outputpro.OutputProcessor;

public class s5 extends s
{
	@Override
    public void StartPump()
    {
      OutputProcessor.setInitialValues();
      OutputProcessor.readyMsg();
      
    }
}
