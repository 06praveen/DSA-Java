//Solved DSA question on string topic to replaced a character in the given string
class Solution {
    public String defangIPaddr(String address) {
        int n=address.length();
        String str="";

        for(int i=0;i<n;i++){
            char ch=address.charAt(i);
            if(ch>='0' && ch<='9'){
                str+=ch;
            }
            else{
                str+= "[.]";
            }
        }
        return str;
    }
}
