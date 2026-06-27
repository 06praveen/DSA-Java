//Solved a DSA problem to find the majority element that appears more than n/2 times
class Solution {
    public int majorityElement(int[] arr) {
        int n=arr.length/2;

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int x:arr){
            map.put(x,map.getOrDefault(x,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()>n){
                return entry.getKey();
            }
        }
        return -1;
    }
}
