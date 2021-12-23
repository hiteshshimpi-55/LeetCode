class Solution {
    public int maximum69Number (int num) {
        String s = Integer.toString(num);
        StringBuilder builder = new StringBuilder();
        boolean isDone = false;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '6' && isDone==false)
            {
                builder.append('9');
                isDone = true;
            }
            else
            {
                builder.append(s.charAt(i));
            }
        }
        return Integer.parseInt(builder.toString());
    }
}
