public class StringBuilde {

    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("");
        for (char ch = 'a'; ch < 'z'; ch++) {
            sb.append(ch);
        }
       char ch= Character.toUpperCase(sb.charAt(0));
        System.out.print(sb.append(ch));
        // Character.toUpperCase(sb);
    }
}
