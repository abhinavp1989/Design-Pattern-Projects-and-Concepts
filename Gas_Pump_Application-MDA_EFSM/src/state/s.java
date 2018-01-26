package state;

import outputpro.OutputProcessor;
public  abstract class s 
{
	OutputProcessor outp_object;//object of the output processor
	int sid;    
    public int getStateId()
    {
        return sid;
    }
    public void set_OutputProcessor(OutputProcessor o)
    {
        outp_object = o;
    }
    public void setStateId(int a)
    {
        sid = a;
    }
    public void Activate(){}
    public void Start(){}
    public void PayCash(){}
    public void PayCredit(){}
    public void Approved(){}
    public void Reject(){}
    public void SelectGas(int g){}
    public void Cancel(){}
    public void StartPump(){}
    public void Pump(){}
    public void StopPump(){}
    public void Receipt(){}
    public void NoReceipt(){}
    
}
