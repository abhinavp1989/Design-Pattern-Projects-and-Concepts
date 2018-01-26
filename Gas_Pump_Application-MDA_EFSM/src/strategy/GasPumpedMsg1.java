package strategy;

public class GasPumpedMsg1 extends GasPumpedMsg
{
    public void gasPumpedMsg()
    {
    	float g = dobj.getG();
    	System.out.printf("Number of gallons of gas pumped=" +g);
    }
    
}
