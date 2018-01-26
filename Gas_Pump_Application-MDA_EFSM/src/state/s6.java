package state;

import outputpro.OutputProcessor;
public class s6 extends s
{
	@Override
    public void Pump()
    {
		OutputProcessor.pumpGasUnit();
		OutputProcessor.gasPumpedMsg();
     
    }
    public void StopPump()
    {
    	
    	OutputProcessor.stopMsg();
    }
}