//Solved a DSA problem to Sort vowels in increasing order according to there ASCII code
class Solution {
    public String sortVowels(String s) {
        int n=s.length();
        ArrayList<Character> list=new ArrayList<>();

        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='A' || ch=='E' ||ch=='I' ||ch=='O' ||ch=='U' || ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u'){
                list.add(ch);
            }
        }

        Collections.sort(list);
        String str="";
        int p=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='A' || ch=='E' ||ch=='I' ||ch=='O' ||ch=='U' || ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u'){
                str += list.get(p);
                p++;
            }
            else{
                str += ch;
            }
        }
        return str;
    }
}
