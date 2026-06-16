//Solved a DSA question on String in which i used cyclic sort 
class Solution {
    public String sortSentence(String s) {
        String[] words = s.split("\\s+");

        int i=0;
        while(i<words.length){
            String str=words[i];
            char ch=str.charAt(str.length()-1);
            if(ch-'0'!=i+1){
                String temp=words[i];
                words[i]=words[(ch-'0')-1];
                words[(ch-'0')-1]=temp;
            }
            else{
                i++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int j=0;j<words.length;j++){
            sb.append(words[j].substring(0,words[j].length()-1));
            if(j!=words.length-1)
                sb.append(" ");
        }
        return sb.toString();
    }
}
