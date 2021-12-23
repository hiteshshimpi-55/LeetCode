class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int net = 0;
        for(int i = 0;i<gain.length;i++)
        {
            net+=gain[i];
            if(net>max) max = net;
        }
        return max;
    }
}
