//Check wheather if we break the string into 2 equal half then it will contain equal no. of vowels of not.
//String length is always even
class Solution {
    public boolean halvesAreAlike(String s) {
        int n=s.length();
        s=s.toLowerCase();
        int c1=0,c2=0;

        for(int i=0;i<n/2;i++){
            char ch1=s.charAt(i);
            if(ch1=='a' || ch1=='e' || ch1=='i' || ch1=='o' || ch1=='u'){
                c1++;
            }
            char ch2=s.charAt((n/2)+i);
            if(ch2=='a' || ch2=='e' || ch2=='i' || ch2=='o' || ch2=='u'){
                c2++;
            }
        }
        return c1==c2;
    }
}
