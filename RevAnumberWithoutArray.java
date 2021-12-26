class Solution {
    public boolean isSameAfterReversals(int num) {
         int or = num;
        int rev = 0;
        while(num!=0)
        {
            rev = rev*10 +  num%10;
            num/=10;

        }
        int rev2 = 0;
        while(rev!=0)
        {
            rev2 = rev2*10 + rev%10;
            rev/=10;
        }

        return or == rev2;
    }
}
