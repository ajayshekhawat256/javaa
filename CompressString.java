public class CompressString {
    public static String coompresString(String str) {
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            // String ch="";
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            newStr = newStr + str.charAt(i);
            if (count > 1) {
                newStr = newStr + count.toString();
            }
            
        }
        return newStr;
    }
    public static String tocompressStringg(String str){
        String sh="";
        for(int i=0;i<str.length();i++){
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            sh+=str.charAt(i);
            if(count>1){
                sh+=count.toString();
            }
        }
        return sh;
    }

    public static void main(String[] args) {
        String str = "aaacdd";
        System.out.println(coompresString(str));
        String str1="aaaacccffffcceeddr";
        System.out.println(tocompressStringg(str1));
    }
}
