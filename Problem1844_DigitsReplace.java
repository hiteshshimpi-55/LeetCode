class Solution {
    public String replaceDigits(String s) {
        StringBuilder temp  = new StringBuilder();
        for (int i = 1; i < s.length(); i=i+2) {
            
            temp.append(s.charAt(i-1));
            char c = (char) (s.charAt(i-1)+(s.charAt(i)-48));
            temp.append(c);
            
        }
        
        if(!(s.charAt(s.length()-1) >=48 && s.charAt(s.length()-1)<=57))
        {
        temp.append(s.charAt(s.length()-1));
        }
        
        return temp.toString();
    }
}
