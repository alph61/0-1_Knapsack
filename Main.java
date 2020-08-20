/**********************************
	Contributed By Shivam Kumar
	Recursive approach of Knapsack 0-1 Problem
***********************************/
public class Main
{
    static int knapsack(int [] wt,int [] val, int cap, int n)
    {
        if(n==0||cap==0)
        return 0;
        
        if(wt[n-1]<=cap)
        {
            return Math.max(val[n-1] + knapsack(wt,val,cap-wt[n-1],n-1) , knapsack(wt,val,cap,n-1));
        }
        else
        return knapsack(wt,val,cap,n-1);
    }
	public static void main(String[] args) {
        //Change wt and val array to test on differnt values 
	int wt[]={2,1,3,1};
	int val[]={10,10,20,20};
	System.out.println(knapsack(wt,val,2,4));
	}
}
