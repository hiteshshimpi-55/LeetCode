class Solution {
    public int numJewelsInStones(String jewels, String stones) {
           int total=0;
        for (int i = 0; i < jewels.length(); i++) {
            char compare = jewels.charAt(i);
            for (int j = 0; j < stones.length(); j++) {
                if(compare == stones.charAt(j)) total++;
            }
        }
        return total;
    }
}
