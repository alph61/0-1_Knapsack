/***********************************************
	KnapSack 0/1 Top Down Approach
	Contributed By :- Shivam Kumar
***********************************************/
public class Main
{
    static int knapsack(int [] wt,int [] val, int cap, int n)
    {
        int [][] dp = new int[n+1][cap+1];  
        int i,j;
        for(i=0;i<n+1;i++)
        {
            for(j=0;j<cap+1;j++)
            {
                if(j==0)
                    dp[i][j]=0;
                
                else if(i==0)
                {
                    dp[i][j]=0;
                }
                else if(wt[i-1]<=j)
                {
                    dp[i][j]= Math.max( val[i-1] + dp[i-1][j-wt[i-1]] , dp[i-1][j]);
                }
                else
                {
                    dp[i][j]=dp[i-1][j];
                }
                    
            }
        }
     
        return dp[n][cap];

    }
	public static void main(String[] args) {
	int wt[]={2,1,3,1};
	int val[]={10,10,20,20};
	System.out.println(knapsack(wt,val,2,4));
	}
}