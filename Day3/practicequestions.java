public class practicequestions {
    public static void main(String[] args) {

        // 1) Reverse String
        String s1 = "JAVA";
        String rev = "";

        for (int i = s1.length() - 1; i >= 0; i--) {
            rev = rev + s1.charAt(i);
        }

        System.out.println("1) Reverse String");
        System.out.println("Original: " + s1);
        System.out.println("Reversed: " + rev);

        // 2) Palindrome Check
        String s2 = "madam";
        String rev2 = "";

        for (int i = s2.length() - 1; i >= 0; i--) {
            rev2 = rev2 + s2.charAt(i);
        }

        System.out.println("\n2) Palindrome Check");
        System.out.println("String: " + s2);
        System.out.println("Reversed: " + rev2);

        if (s2.equals(rev2)) {
            System.out.println("Result: Palindrome");
        } else {
            System.out.println("Result: Not Palindrome");
        }

        // 3) Count Vowels
        String s3 = "FullStack";
        s3 = s3.toLowerCase();
        int vowelCount = 0;

        for (int i = 0; i < s3.length(); i++) {
            char ch = s3.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }

        System.out.println("\n3) Vowel Count");
        System.out.println("String: " + s3);
        System.out.println("Vowels: " + vowelCount);

        // 4) Word Count
        String sentence = "Java Full Stack Developer";
        String[] words = sentence.split(" ");

        System.out.println("\n4) Word Count");
        System.out.println("Sentence: " + sentence);
        System.out.println("Word Count: " + words.length);
    }
}
