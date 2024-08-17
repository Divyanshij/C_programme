public class StringLab {
    public static void main(String[] args) {
        // Creating strings
        String str1 = "Hello";
        String str2 = new String();

        // Concatenation
        String result = str1 + " " + str2;
        System.out.println("Concatenated String: " + result);

        // Length of a string
        int length = result.length();
        System.out.println("Length of the String: " + length);

        char charAtIndex = result.charAt(7);
        System.out.println("Character at index 7: " + charAtIndex);

        // Substring
        String subString = result.substring(6, 11);
        System.out.println("Substring from index 6 to 10: " + subString);

        // Uppercase and lowercase
        String upperCaseStr = result.toUpperCase();
        String lowerCaseStr = result.toLowerCase();
        System.out.println("Uppercase: " + upperCaseStr);
        System.out.println("Lowercase: " + lowerCaseStr);

        // Equality check
        boolean isEqual = str1.equals(str2);
        System.out.println("Are str1 and str2 equal? " + isEqual);

        // String comparison
        int comparisonResult = str1.compareTo(str2);
        System.out.println("Comparison result (str1.compareTo(str2)): " + comparisonResult);

        // Checking if a string contains another string
        boolean contains = result.contains("World");
        System.out.println("Does the string contain 'World'? " + contains);
    }
}
