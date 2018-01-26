package strategy;

public class StoreCash2 extends StoreCash
{
    public void storeCash()
    {
    	float c =dobj.getcash();
        float d =c;
        dobj.setcash(d);
    }
    
}