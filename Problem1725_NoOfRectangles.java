class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        
        int max = 0;
        int count = 0;
        for(int i = 0;i < rectangles.length ; i++)
        {
            int k = Math.min(rectangles[i][0] , rectangles[i][1]);
            if(k>max){
                max=k;
                count=1;
            }
            else if(max==k)
                count++;
                
        }
        return count;
    }
}
