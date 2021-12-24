class Solution {
    public int subsetXORSum(int[] nums) {
        return helper(nums,0,0);
    }
    public int helper(int[] nums , int level , int currentXor)
    {
        
       if(level == nums.length) return currentXor;
        
       int inc = helper(nums,level + 1 ,currentXor ^ nums[level]);

       int exc = helper(nums,level + 1,currentXor);
        
       return inc + exc; 
    }
}
