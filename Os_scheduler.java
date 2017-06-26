package p;

import java.util.*;

public class Os_scheduler {

  /* Class requred for Process detail like as PCB */
	class Process{
		int arriv = 0;
		int burst = 0;
		int tburst = 0;
		String pId = null;
		public Process(int a, int b, int c)
		{
			this.arriv  = a;
			this.burst  = b;
			this.tburst = b;
			this.pId    = "Process"+c;
		}
	}
	

	float avgTimeRR(int a_t[], int b_t[], int slice)
	{
		int index      = 0;
		float totalAvg = 0;
		int loop_exit  = 0;
		int t_check    = a_t[0];
		
		/* Reqiured Queue for running processes again and again */
		Queue<Process> l = new LinkedList<Process>();
	    Process obj = new Process(a_t[0], b_t[0], 1); 
	    l.add(obj);
		
	    while(true)
		{
			
			t_check += slice;
			
			while((index <= a_t.length-2) && (a_t[index+1] <= t_check))
			{ 
				index++;
				Process obj2 = new Process(a_t[index], b_t[index], index+1);
				l.add(obj2);
			}
			
			if(loop_exit == a_t.length)
				break;
		
	  if(!(l.isEmpty()))		
      {		
			Process temp = l.poll();
			int v = temp.burst;
			v -= slice;
			
			if(v <= 0)
			{
				loop_exit++;
				float val = 0;
				if(v == 0)
				{   val = (t_check - temp.arriv) - temp.tburst;
					totalAvg += val;
				}
					
				else
				{
					int mod = (temp.burst%slice);
					t_check -= slice;
					t_check += mod;
					val = (t_check - temp.arriv) - temp.tburst;  
					totalAvg += val;
					
				}
				System.out.print(temp.pId);
				System.out.print("\nArrival Time : "+temp.arriv+"\nCompletion Time :"+t_check+ "\nWaiting Time : "+val +"\n------------------------------\n");
				
			}
			else
			{
				temp.burst -= slice;
				l.add(temp);
			}
		  }
	  else
			t_check = a_t[index+1];
	  
		}
		return (totalAvg / a_t.length);
		
	}
	
	
public static void main(String arg[])
  {
	 int a_t[] = {0, 0, 21}; // arrival time
	 int b_t[] = {4, 5, 8}; // burst Time
	 int t_slice = 2;       // time quantum
	  
	 Os_scheduler obj = new Os_scheduler(); 
     float avgTime = obj.avgTimeRR(a_t, b_t, t_slice);
     
     System.out.print("\nAverage Waiting Time of Round-Robin: "+ avgTime );
  
  
  }

}
