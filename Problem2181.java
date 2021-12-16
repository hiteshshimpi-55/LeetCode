class Solution {
    public int subtractProductAndSum(int n) {
        
             int sum = 0;
        int pro = 1;

       while(n!=0)
       {
           int temp = n%10;
           n/=10;
           sum+=temp;
           pro*=temp;
       }
       return pro-sum;
        
    }
}
