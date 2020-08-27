/******************************************
	SubSet Sum Count Problem (Knapsack)
	Contributed by: Shivam Kumar
*******************************************/
public class Main
{
    static int subsetSumCount(int [] arr,int sum ,int n)
    {
        int dp[][]= new int[n+1][sum+1];
        int i,j;
        for(i=0;i<n+1;i++)
        {
            for(j=0;j<sum+1;j++)
            {
                if(j==0)
                dp[i][j]= 1;
                else if(i==0)
                dp[i][j]=0;
                else if(arr[i-1]<=j)
                dp[i][j] = dp[i-1][j-arr[i-1]] + dp[i-1][j];
                else
                dp[i][j]=dp[i-1][j];
            }
        }
        return dp[n][sum];
    }
	public static void main(String[] args) {
	    int arr[] ={2,4,5,1,0,0};
	    System.out.println(subsetSumCount(arr,5,6));
		
	}
}
