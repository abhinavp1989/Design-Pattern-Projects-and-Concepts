package driver;

import abstractfactory.*;
import datastore.*;
import mdaefsm.mda;
import java.io.*;
import java.util.*;
import state.*;
import inputpro.GP1;
import inputpro.GP2;
import outputpro.OutputProcessor;


public class driver
{
	static Scanner input=new Scanner(System.in);
	static BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
	static boolean flag=true;
	public static void main(String[] args) throws NumberFormatException, IOException
    {
		while(flag)
		{	
        System.out.println("\n	\t\t\t Gas Pump Model\t \t");
		System.out.println("\n	Select Gas Pump ");
		System.out.println("\n 1. GasPump-1  ");
		System.out.println("\n 2. GasPump-2  ");
		System.out.println("\n Enter your choice ");
		int choice = -1;
		try 
		{
            choice = input.nextInt();
        } 
		catch (InputMismatchException e) 
		{
            continue;
        }
        if(choice==1)
        {
                
                
                    GP1 g1 = new GP1(); //g1 represents the object of Gas Pump1 
                    mda mda_object = new mda();//creating an object of the mda class
                    g1.setMDA(mda_object);//Set the mda with the mda object created
                    OutputProcessor OutputProcessor_o = new OutputProcessor();
                    cf1 cf1_object = new cf1();
                    datastore datastore_object;
                    datastore_object = cf1_object.getdata();
                    g1.setfactory(cf1_object);
                    g1.setdata(datastore_object);
                    
                    
                    s0 S0_object  = new s0();
                    S0_object.set_OutputProcessor(OutputProcessor_o);//Setting up the connections  
                    S0_object.setStateId(0);//Call to the setStateId function of the state class
                    s1 S1_object = new s1();
                    S1_object.set_OutputProcessor(OutputProcessor_o);
                    S1_object.setStateId(1);
                    s2 S2_object = new s2();
                    S2_object.set_OutputProcessor(OutputProcessor_o);
                    S2_object.setStateId(2);
                    s3 S3_object = new s3();
                    S3_object.set_OutputProcessor(OutputProcessor_o);
                    S3_object.setStateId(3);
                    s4 S4_object = new s4();
                    S4_object.set_OutputProcessor(OutputProcessor_o);
                    S4_object.setStateId(4);
                    s5 S5_object = new s5();
                    S5_object.set_OutputProcessor(OutputProcessor_o);
                    S5_object.setStateId(5);
                    s6 S6_object = new s6();
                    S6_object.set_OutputProcessor(OutputProcessor_o);
                    S6_object.setStateId(6);
                    s7 S7_object = new s7();
                    S7_object.set_OutputProcessor(OutputProcessor_o);
                    S7_object.setStateId(7);
                    OutputProcessor_o.setData(datastore_object);
                    OutputProcessor_o.setfactory(cf1_object);// Setting the object of the concrete factory 1 
                    mda_object.setStates(S0_object);    
                    mda_object.setStatesList(S0_object,S1_object,S2_object,S3_object,S4_object,S5_object,S6_object,S7_object);  
                    String input=null;
                    int ch;
                    while(true)
                    {
                    	
                    	System.out.println("\n\n Please select your option from the list of the available choices for GasPump-1\t\t");
						System.out.println("\n 0.Activate (float a,float b)"); 
						System.out.println("\n 1.Start()");
						System.out.println("\n 2.PayCredit()");
						System.out.println("\n 3.Reject()");
						System.out.println("\n 4.Cancel() ");
						System.out.println("\n 5.Approved()");
						System.out.println("\n 6.Super()");
						System.out.println("\n 7.Regular()");
						System.out.println("\n 8.StartPump() ");
						System.out.println("\n 9.PumpGallon()");
						System.out.println("\n 10.StopPump() ");
						System.out.println("\n Press 11 to exit \n\n ");
						input=buf.readLine();
                        ch=Integer.parseInt(input);
                        
                        switch(ch)
                        {
                            case 0:	System.out.println("\n Enter the value of a for activating the Gas Pump \n");
                               		float a=Float.parseFloat(buf.readLine());
                               		System.out.println("\n Enter the value of b for activating the Gas Pump \n");
                               		float b=Float.parseFloat(buf.readLine());
                               		g1.Activate(a,b);      
                               		break;
                            case 1:	g1.Start();   
                                	break;
                            case 2:g1.PayCredit();   
                            		break;
                            case 3:  g1.Reject();   
                            		break;
                            case 4:g1.Cancel();   
                                	break;
                            case 5:g1.Approved();   
                                	break;
                            case 6:g1.Super(); 
                                    break;
                            case 7:g1.Regular();
                                    break;
                            case 8:
                            	g1.StartPump();   
                                break;
                            case 9: 
                                g1.PumpGallon();   
                                break;
                            case 10: 
                                g1.StopPump();   
                                break;
                            case 11:    
                            		return;
                            default: 
                                System.out.println("\n \n Invalid Input Try Again");
                        }
                    }
                }
                else
                if(choice==2)
                {
                    
                	
                	GP2 g2 = new GP2(); //g2 represents the object of Gas Pump2
                	mda mda_object = new mda();
                	g2.setMDA(mda_object);//Setting the mda with the mda object created
                	OutputProcessor OutputProcessor_o = new OutputProcessor();
                    cf2 cf2_object = new cf2();
                    datastore datastore_object;
                    datastore_object = cf2_object.getdata();      
                    g2.setfactory(cf2_object);// Setting the object of the concrete factory 2 
                    g2.setdata(datastore_object);
                	s0 S0_object  = new s0();//S0_object represents the object Of state 0
                	S0_object.set_OutputProcessor(OutputProcessor_o);
                    S0_object.setStateId(0);
                    s1 S1_object = new s1();
                    S1_object.set_OutputProcessor(OutputProcessor_o);
                    S1_object.setStateId(1);
                    s2 S2_object = new s2();
                    S2_object.set_OutputProcessor(OutputProcessor_o);
                    S2_object.setStateId(2);
                    s3 S3_object = new s3();
                    S3_object.set_OutputProcessor(OutputProcessor_o);
                    S3_object.setStateId(3);
                    s4 S4_object = new s4();
                    S4_object.set_OutputProcessor(OutputProcessor_o);
                    S4_object.setStateId(4);
                    s5 S5_object = new s5();
                    S5_object.set_OutputProcessor(OutputProcessor_o);
                    S5_object.setStateId(5);
                    s6 S6_object = new s6();
                    S6_object.set_OutputProcessor(OutputProcessor_o);
                    S6_object.setStateId(6);
                    s7 S7_object = new s7();
                    S7_object.set_OutputProcessor(OutputProcessor_o);
                    S7_object.setStateId(7);
                    OutputProcessor_o.setData(datastore_object);
                    OutputProcessor_o.setfactory(cf2_object);
                    mda_object.setStates(S0_object);    
                    mda_object.setStatesList(S0_object,S1_object,S2_object,S3_object,S4_object,S5_object,S6_object,S7_object);  
                    String input=null;
                    int ch;
                    while(true)
                    {
                    	System.out.println("\n\n Please select your option from the list of the available choices for GasPump-2\t\t");
						System.out.println("\n\t\t 0.\t Activate (int a,int b,int c) "); 
						System.out.println("\n\t\t 1.\t Start ");
						System.out.println("\n\t\t 2.\t PayCash(float c) ");
						System.out.println("\n\t\t 3.\t Cancel ");
						System.out.println("\n\t\t 4.\t Super ");
						System.out.println("\n\t\t 5.\t Regular ");
						System.out.println("\n\t\t 6.\t Premium ");
						System.out.println("\n\t\t 7.\t StartPump");
						System.out.println("\n\t\t 8.\t PumpLiter");
						System.out.println("\n\t\t 9.\t StopPump");
						System.out.println("\n\t\t 10.\t Receipt");
						System.out.println("\n\t\t 11.\t NoReceipt");
						System.out.println("\n\t\t Press any other key to exit \n\n ");
						input=buf.readLine();
                        ch=Integer.parseInt(input);
                        switch(ch)
                        {
							case 0: System.out.println(" \n\n Enter the value of a to activate");
                    			int a=(int)Float.parseFloat(buf.readLine());
                    			System.out.println("\n\n Enter the value of b to activate");
                    			int b=(int)Float.parseFloat(buf.readLine());
                    			System.out.println("\n\n Enter the value of c to activate");
                    			int c=(int)Float.parseFloat(buf.readLine());
                    			g2.Activate(a,b,c);      //calls method activate in GasPump1
                    			break;

							case 1: g2.Start();   
                        		break;
                        		
							case 2: 
								System.out.println("\n Enter the amount you wish to pay by cash ");
                                String cash=buf.readLine();
                                float c1 =Float.parseFloat(cash);
                                g2.PayCash(c1); 
                    			break;
                        		
							case 3: g2.Cancel();   
                        		break;
                        		
							case 4:g2.Super();
                    			break;
                    			
							case 5:g2.Regular();
                    			break;
                    		
							case 6:g2.Premium();
                			break;
	
							case 7: g2.StartPump();   
                        		break;
							case 8: g2.PumpLiter();   
                        		break;
							case 9: g2.StopPump();
                        		break;
                        		
							case 10: g2.Receipt();
                        		break;
							case 11: g2.NoReceipt();
								break;
                        		
	                    default: 
                        System.out.println("\n Invalid Input Try Again");
                    }
                
                  }
          
              }
              else
            	  System.out.println("Invalid Input");
		}   
        }      
                
                
                
           
    }
	

