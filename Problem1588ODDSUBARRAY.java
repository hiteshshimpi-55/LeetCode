class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        
        int sum = 0;
        for(int i = 0; i < arr.length ; i++)
        {
            int start = arr.length-i;
            int end   = i+1;
            int odd = 0;
            if(start*end % 2 == 0)
            {
                odd = start*end / 2;
            }
            else {
                odd = start*end / 2 + 1;
            }

            sum+=arr[i]*odd;
        }
        
        return sum;
    }
}
