//Solved the DSA question on String to check wheather it is palindrome or not (by ignoring the specail characters)
class Solution {
    public boolean isPalindrome(String str) {
        str=str.toLowerCase();
        int n=str.length();
        int s=0,e=n-1;

        while(s<=e){
            char ch1=str.charAt(s);
            char ch2=str.charAt(e);

            if(!((ch1>=48 && ch1<=57) || (ch1>=97 && ch1<=122))){
                s++;
            }
            else if(!((ch2>=48 && ch2<=57) || (ch2>=97 && ch2<=122))){
                e--;
            }
            else if(ch1!=ch2){
                return false;
            }
            else{
                s++;
                e--;
            }
        }
    return true;
    }
}
