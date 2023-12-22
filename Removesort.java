public class Removesort {
    public static void ReverseString(String str, int idx, StringBuilder newStr, boolean map[]) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        char currArr = str.charAt(idx);
        if (map[currArr - 'a'] == true) {
            ReverseString(str, idx + 1, newStr, map);
        } else {
            map[currArr - 'a'] = true;
            newStr.append(currArr);
            ReverseString(str, idx, newStr, map);
        }

    }

    public static void main(String args[]) {
        String str = "aabbccddeeff";
        ReverseString(str, 0, new StringBuilder(""), new boolean[26]);

    }
}
