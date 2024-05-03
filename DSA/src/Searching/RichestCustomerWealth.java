package Searching;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int a[][]={{1,2,3},{3,2,1}};
        int richestValue = maximumWealth(a);
        System.out.println(richestValue);
    }
    public static int maximumWealth(int[][] accounts) {
        int sum=0, ans=0;
        for(int i=0;i<accounts.length;i++){
            for(int j=0;j<accounts[i].length;j++){
                sum=sum+accounts[i][j];
            }
            if(ans<sum){
                ans=sum;
            }
            sum=0;
        }
        return ans;
    }
}
