public class LoweercaseVowels {
    public static int lowercaseVowels(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]){
        String str="skmlneiojdsu";
        System.out.println(lowercaseVowels(str));
    }
}
