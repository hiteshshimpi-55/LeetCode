class Solution {
    public String defangIPaddr(String address) {
        
       String temp = null;
        for (int i = 0; i < address.length(); i++) {

            if(address.charAt(i) == '.'){
                temp  += "[.]";
            }
            else if(temp == null)
            {
                temp = ""+address.charAt(i);
            }
            else  {
                temp = temp+address.charAt(i);
            }
        }
        return temp;
    }
}
