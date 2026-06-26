//Solved a DSA problem using HashMap
class Solution {
    public int singleNumber(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int x:arr){
            map.put(x,map.getOrDefault(x,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }
        return -1;
    }
}
