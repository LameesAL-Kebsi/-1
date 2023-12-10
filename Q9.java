public class Q9 {
    public static void main(String[] args) {
        String y = "Let's try, Mike!";
        String result = removePunctuation(y);
        System.out.println(result);
    }

    public static String removePunctuation(String y) {
        StringBuilder ss = new StringBuilder();

        for (int i = 0; i < y.length(); i++) {
            char r = y.charAt(i);
            if (Character.isLetterOrDigit(r) || Character.isWhitespace(r)) {
                ss.append(r);
            }
        }

        return ss.toString();
    }
}
