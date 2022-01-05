class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,(a,b) -> -Integer.compare(a[1],b[1]));
        int max = 0;
        for(int[] boxes:boxTypes)
        {
            if(truckSize < boxes[0])
                return max+truckSize*boxes[1];
            
            max +=boxes[0]*boxes[1];
            truckSize-=boxes[0];
        }
        return max;
    }
}
