class Solution {
    public boolean checkIfPangram(String sentence) {
//          int[] arr = new int[26];
//         for (int i = 0; i <sentence.length(); i++) {
//             int index = sentence.charAt(i)-97;
//             arr[index]+=1;
//         }
//         for (int i = 0; i < arr.length; i++) {
//             if(arr[i]==0){
//                 return false;
//             }

//         }
        
       
         for(char i='a';i<='z';i++) 
            if(!(sentence.contains(String.valueOf(i))))
               return false;
        
        return true;
    }
}
