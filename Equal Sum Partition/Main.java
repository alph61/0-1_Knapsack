/*********************************************
	Equal Sum Partition 
	Contributed by:- Shivam Kumar
**********************************************/
public class Main
{
    static boolean equalSumPart(int [] arr,int sum ,int n)
    {
        boolean dp[][]= new boolean[n+1][sum+1];
        int i,j;
        for(i=0;i<n+1;i++)
        {
            for(j=0;j<sum+1;j++)
            {
                if(j==0)
                dp[i][j]= true;
                else if(i==0)
                dp[i][j]=false;
                else if(arr[i-1]<=j)
                dp[i][j] = dp[i-1][j-arr[i-1]] || dp[i-1][j];
                else
                dp[i][j]=dp[i-1][j];
            }
        }
        return dp[n][sum];
    }
	public static void main(String[] args) {
	    int arr[] ={2,4,5,9};
	    int i, sum=0,len;
	    len=arr.length;
	    for(i=0;i<len;i++)
	    sum+=arr[i];
	    if(sum%2==0)
	    System.out.println(equalSumPart(arr,sum/2,4));
	    else
		System.out.println(false);
	}
}
