class Solution {
    public int countPoints(String rings) {
                int[][] arr = new int[10][3];

        for (int i = 0; i < rings.length(); i++) {
            if(rings.charAt(i)>=48 && rings.charAt(i)<=57)
            {
                int index =rings.charAt(i)-48;
                char s = rings.charAt(i-1);
                switch (s)
                {
                    case 'R' :
                        if(arr[index][0]==0)
                        {
                            arr[index][0] = 1;
                        }
                                break;
                    case 'G' :   if(arr[index][1]==0)
                    {
                        arr[index][1] = 1;
                    }
                        break;

                    case 'B' :  if(arr[index][2] ==0)
                    {
                        arr[index][2] = 1;
                    }
                        break;
                }
            }
        }

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum+=arr[i][j];
                if(sum == 3)
                {
                    count ++;
                }
            }
        }

        return count;
    }
}
