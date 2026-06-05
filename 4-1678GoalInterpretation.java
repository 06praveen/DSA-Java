//Solved a problem in which interpretation of the given string that is replace the character according to the condition
class Solution {
    public String interpret(String command) {
        int n = command.length();
        String str="";

        for(int i=0;i<n-1;i++){
            if(command.charAt(i)=='G'){
                str+="G";
            }
            else{
                if(command.charAt(i+1)==')'){
                    str+="o";
                    i+=1;
                }
                else{
                    str+="al";
                    i+=3;
                }
            }
        }
        if(command.charAt(n-1)=='G'){
            str+="G";
        }

        return str;
    }
}
