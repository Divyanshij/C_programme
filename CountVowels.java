//Write a Java method to count all vowels in a string.
public class CountVowels {

    public static void main(String[] args) {
        String input = "divyanshi";
        int vowelCount = countVowels(input);
        System.out.println("Number of vowels in the string: " + vowelCount);
    }

    public static int countVowels(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char c ;
            c=Character.toLowerCase(input.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }
}