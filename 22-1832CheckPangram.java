//Solved a DSA problem based on String topic
class Solution {
    public boolean checkIfPangram(String s) {
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<26;i++){
            set.add((char)('a'+i));
        }

        int count=0;
        for(int i=0;i<s.length();i++){
            if(set.contains(s.charAt(i))){
                count++;
                set.remove((char)s.charAt(i));
            }
        }
        return count==26;
    }
}
