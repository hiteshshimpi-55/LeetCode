class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map = new LinkedHashMap<>();
        for (int i:arr
             ) {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        HashSet<Integer>  hs = new HashSet<>();
        for (var i:map.keySet()
             ) {
            if(!(hs).add(map.get(i)))
                return false;
        }

        return true;
        
    }
}
