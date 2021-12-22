class Solution {
    public String truncateSentence(String s, int k) {
        
        String[] sen = s.split(" ");
        StringBuilder ss = new StringBuilder();
        for (int i = 0; i < k; i++) {
            ss.append(sen[i]);
            if(i!=k-1)
            {
                ss.append(" ");
            }
        }
        return ss.toString();
    }
}
