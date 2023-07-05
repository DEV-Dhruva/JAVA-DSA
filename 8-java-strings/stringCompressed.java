public class stringCompressed {
    public static String getComPress(String str) {
        StringBuilder sb = new StringBuilder("");
        // String newStr = "";

        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            // newStr += str.charAt(i);
            if (count > 1) {
                sb.append(count.toString());
                // newStr += count.toString();
            }
        }
        return sb.toString();
        // return newStr;
    }

    public static void main(String[] args) {
        String str = "aaabbcccdd";
        System.out.println(getComPress(str));
    }
}
