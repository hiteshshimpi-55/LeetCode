class Solution {
    public String sortSentence(String s) {
        
         String[] sen = s.split(" ");
            String[] arr = new String[sen.length];
            for (int i = 0; i < sen.length; i++) {
                int index = 0;
                for (int j = 0; j < sen[i].length(); j++) {
                    if(sen[i].charAt(j) > 48  && sen[i].charAt(j)<59)
                    {
                        index = sen[i].charAt(j) - 48;
                    }
                }
                arr[index-1] = sen[i];
            }
            String temp =  "";
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length(); j++) {
                
                    if(arr[i].charAt(j) >48  && arr[i].charAt(j) < 59 && arr[i].charAt(j) != arr.length - 48)
                    {
                        temp+=' ';
                    }
                    else
                    {
                        temp+=arr[i].charAt(j);
                    }
                }
            }

           String output = "";
            if(temp.charAt(temp.length()-1) == ' ')
            {
                for (int i = 0; i < temp.length()-1; i++) {
                    output+=temp.charAt(i);
                }
            }
            return output;
    }
}
