package state;
import outputpro.OutputProcessor;
public class s3 extends s
{
	@Override
    public void Approved()
    {
      OutputProcessor.displayMenu();
      
    }
    public void Reject()
    {
     OutputProcessor.rejectMsg();
    
    }
}
