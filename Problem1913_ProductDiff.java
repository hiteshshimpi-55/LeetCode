class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int start = 0;
        int end   = nums.length-1;
        return (nums[end]*nums[end-1])-(nums[start]*nums[start+1]);
    }
}
