public class toUpperCasee {
    public static String firstToUpperCase(String str){
        StringBuilder sb=new StringBuilder(" ");
        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();

    }

    public static String toLowerCase(String str){
        StringBuilder sb=new StringBuilder(' ');
        sb.append(Character.toLowerCase(str.charAt(0)));
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toLowerCase(str.charAt(i)));
            }
            else{
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
        }
        return sb.toString();
    }
    public static void main(String args[]){
        String str="hi, this is ajay";
        System.out.println(firstToUpperCase(str));
        String str1="Hi,I Am Ajay";
        System.out.println(toLowerCase(str1));
        System.out.println(5^6);
    }
}
