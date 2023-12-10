public class Q8 {
    public static void main(String[] args) {
        String str = "Hi!";
        int vowelCount = countVowels(str);
        System.out.println("Number of vowels: " + vowelCount);
    }

    public static int countVowels(String str) {
        int count = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char x = str.charAt(i);
            if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') {
                count++;
            }
        }

        return count;
    }
}
