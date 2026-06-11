//Solved a DSA problem in which we have to return the length of last word in a given string
class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.trim().split("\\s+");
        int n=words.length;
        String str=words[n-1];
        return str.length();
    }
}
