//Solved a DSA problem on string topic to print the string column name according to Excel with the help of columnNumber
class Solution {
    public String convertToTitle(int columnNumber) {
        String str="";
        while(columnNumber>0){
            columnNumber--;
            char ch = (char)('A'+(columnNumber%26));
            str = ch + str;
            columnNumber /= 26;
        }
        return str;
    }
}
