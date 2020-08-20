/**************************************************
	MEMOIZED VERSION OF 0-1 KNAPSACK PROBLEM
		BOTTOM - UP APPROACH
	CONTRIBUTED BY- SHIVAM KUMAR
***************************************************/ 
public class Main
{
    static int knapsack1(int [] wt,int [] val, int cap, int n)
    {
        int dp[][]= new int[n+1][cap+1];
        int res;
        return knapsack(wt,val,cap,n,dp);
    }
    static int knapsack(int [] wt,int [] val, int cap, int n,int [][] dp)
    {
        if(n==0||cap==0)
        return 0;
        if(dp[n][cap]!=0)
        {
            return dp[n][cap];
        }
        if(wt[n-1]<=cap)
        {
            return dp[n][cap] = Math.max(val[n-1] + knapsack(wt,val,cap-wt[n-1],n-1,dp) , knapsack(wt,val,cap,n-1,dp));
        }
        else
        return dp[n][cap]=knapsack(wt,val,cap,n-1,dp);
    }
	public static void main(String[] args) {
	int wt[]={2,0,0,0};
	int val[]={40,2,20,7};
	
    System.out.println(knapsack1(wt,val,10,4));
	}
}