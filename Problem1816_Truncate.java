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
/-100ms
class Solution {
    public String truncateSentence(String s, int k) {
        int i=0,count=0;
        for(i=0;i<s.length()&&count<k;i++){
            if(s.charAt(i)==' '){count++;}
            
        }
        if(i==s.length()){return s.substring(0,i); }
        return s.substring(0,i-1);
    }
}
