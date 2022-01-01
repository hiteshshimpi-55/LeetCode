class Solution {
    public int[] sortArrayByParity(int[] nums) {
        
        int i = 0,j=0,n=nums.length;
        while(j<n)
        {
            if(nums[i]==0)
            {
                i++;
            }
            else if(nums[j]%2==0)
            {
                swap(nums,i,j);
                i++;
            }
            j++;
        }
        
        return nums;
        
    }
    public void swap(int[] nums,int a,int b)
    {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
