//Solved a Easy DSA problem on string topic
class Solution {
    public boolean isAnagram(String s, String t) {
        int n=s.length();
        int m=t.length();
        if(n!=m){
            return false;
        }

        ArrayList<Character> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            list.add(ch);
        }

        for(int i=0;i<m;i++){
            char ch=t.charAt(i);
            if(!list.contains(ch)){
                return false;
            }
            list.remove((Character)ch);
        }
        return true;
    }
}
