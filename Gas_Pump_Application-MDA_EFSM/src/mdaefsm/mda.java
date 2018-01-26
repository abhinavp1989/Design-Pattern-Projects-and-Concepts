package mdaefsm;

import state.*;
public class mda
{
    s sid; //sid is used to point to the current state object
    s[] list = new s[8];   
    public void setStates(s a)
    {
    sid = a;
    }
    public void setStatesList( s t1, s t2, s t3, s t4, s t5, s t6,s t7,s t8)//setting the states
    {
    	list[0] = t1; //start state
    	list[1] = t2; //S0 state
    	list[2] = t3; //S1 state
    	list[3] = t4; //S2 state 
    	list[4] = t5; //S3  state
    	list[5] = t6; //S4 state
    	list[6] = t7; //S5 state
    	list[7] = t8; //S6 state
    }
    public void Activate()
    {
    	int cur = sid.getStateId();
    	//System.out.print(cur);
    	switch(cur)
    	{
        	case 0: 
        	{
        	  sid.Activate();
        	  sid = list[1];
        	  break; 
        	}
        	case 1: break; 
        	case 2: break; 
        	case 3: break; 
        	case 4: break; 
        	case 5: break; 
        	case 6: break; 
        	case 7: break; 
    	} 
    }
    public void Start()
    {   
    	int cur = sid.getStateId();
    	switch(cur)
    	{
        case 0:break; 
        case 1: 
        {
        	sid.Start();
            sid = list[2];
            break; 
        }
        case 2:  break; 
        case 3:  break; 
        case 4:  break; 
        case 5:  break; 
        case 6:  break; 
        case 7:  break; 
     
    	}
    }

    public void PayCash()
    { 
    int cur = sid.getStateId();
    switch(cur)
    {
        case 0:  break; 
        case 1:  break; 
        case 2:
        {
        	sid.PayCash();
            sid = list[4];
         }
        case 3:  break; 
        case 4:  break; 
        case 5:  break; 
        case 6:  break; 
        case 7: break; 
    	}
    }
    public void PayCredit()
    { 
    int cur = sid.getStateId();
    switch(cur)
    {
        case 0: break; 
        case 1:  break; 
        case 2: 
        {
            sid.PayCredit();
            sid = list[3];
        }
        case 3:  break; 
        case 4:  break; 
        case 5:  break; 
        case 6:  break; 
        case 7:  break; 
       
    }
}


    public void Approved()
    {
    int cur = sid.getStateId();
    switch(cur)
    {
        case 0:  break; 
        case 1:  break; 
        case 2:  break; 
        case 3:
        {
           sid.Approved();
           sid = list[4];
           break;
        }
        case 4: break; 
        case 5: break; 
        case 6: break; 
        case 7: break; 

    }
}

public void Reject()
{
    int cur = sid.getStateId();
    switch(cur)
    {
        case 0:  break; 
        case 1:  break; 
        case 2:  break; 
        case 3:
        {
            sid.Reject();
           sid = list[1];
           break; 
        }
        case 4:break; 
        case 5:break; 
        case 6:break; 
        case 7:break; 
    }
}

public void SelectGas(int g)
{
    int cur = sid.getStateId();
    switch(cur)
    {
        case 0: break; 
        case 1: break; 
        case 2: break; 
        case 3:  break; 
        case 4: 
        { 
        	sid.SelectGas(g);
            sid = list[5];
            break;
        }
        case 5: break; 
        case 6: break; 
        case 7: break; 
    }
}

	public void Cancel()
	{
    int cur = sid.getStateId();
    switch(cur)
    {
        case 0:  break; 
        case 1:  break; 
        case 2:  break; 
        case 3:  break; 
        case 4: 
        { 
        	 sid.Cancel();
            sid = list[1];
            break;
        }
        case 5:  break; 
        case 6:  break; 
        case 7:  break; 
    }
}

	public void StartPump()
	{
    int cur = sid.getStateId();
    switch(cur)
    {
        case 0:  break; 
        case 1:  break; 
        case 2:  break; 
        case 3:  break; 
        case 4:  break; 
        case 5:
        {
        	sid.StartPump();
            sid = list[6];
            break;
        }
        case 6:  break; 
        case 7:  break; 
    }
}

	public void Pump()
	{
    int cur = sid.getStateId();
    switch(cur)
    {
        case 0:  break; 
        case 1:  break; 
        case 2:  break; 
        case 3:  break; 
        case 4:  break; 
        case 5:  break; 
        case 6: 
        { 
        	System.out.println("\n\n The gas is being pumped");
            sid.Pump();
            sid = list[6];
            break; 
       }
        case 7:  break; 
    }
}

	public void StopPump()
 	{
    int cur = sid.getStateId();
    switch(cur)
    {
        case 0: break; 
        case 1: break; 
        case 2: break; 
        case 3: break; 
        case 4:  break; 
        case 5:  break; 
        case 6:
        { 
        	 sid.StopPump();
            sid = list[7];
            break;
        }
        case 7:  break; 
    	}
}
 	public void Receipt()
 	{
    int cur = sid.getStateId();
    switch(cur)
    {
        case 0:  break; 
        case 1:  break; 
        case 2: break; 
        case 3:  break; 
        case 4:  break; 
        case 5:  break; 
        case 6: break;
        case 7:
        { 
        	 sid.Receipt();
            sid = list[1];
            break;
       }

    }
}

 	public void NoReceipt()
 	{
    int cur = sid.getStateId();
    switch(cur)
    {
        case 0: break; 
        case 1: break; 
        case 2: break; 
        case 3: break; 
               
        case 4: break; 
        case 5: break; 
        case 6: break;
        case 7:
        	{ 
        	 sid.NoReceipt();
            sid = list[1];
            break;
        	}

    	}
 	}

}
