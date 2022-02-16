package ua.com.alevel;

public final class ReverseStringUtil {

    private ReverseStringUtil() { }

    public static String reverse(String str) {
        char[] arrayOfChars = str.toCharArray();
        StringBuilder reverseString = new StringBuilder();
        for (int i = arrayOfChars.length - 1; i >= 0; i--) {
            reverseString.append(arrayOfChars[i]);
        }
        return reverseString.toString();
    }

    public static String reverseEachWord(String str) {
        StringBuilder reverseString = new StringBuilder();
        String[] arrayOfStrings = str.split(" ");
        for (int i = 0; i < arrayOfStrings.length; i++) {
            reverseString.append(reverse(arrayOfStrings[i])).append(" ");
        }
        return reverseString.toString();
    }

    public static String reverse(String str, String substr) {
        if (!str.contains(substr)) {
            return "There isn't such substring!";
        }
        char[] arrayOfChars = str.toCharArray();
        int endIndex = str.indexOf(substr) + substr.length();
        String substrTemp = reverse(str.substring(str.indexOf(substr), endIndex));
        StringBuilder reverseString = new StringBuilder();
        for (int i = 0; i < str.indexOf(substr); i++) {
            reverseString.append(arrayOfChars[i]);
        }
        reverseString.append(substrTemp);
        for (int i = endIndex; i < arrayOfChars.length; i++) {
            reverseString.append(arrayOfChars[i]);
        }
        return reverseString.toString();
    }

    public static String reverse(String str, int firstIndex, int lastIndex) {
        if (firstIndex < 0 || lastIndex > str.length()) {
            return "Incorrect indexes!";
        }
        String substr = str.substring(firstIndex, lastIndex + 1);
        return reverse(str, substr);
    }

    public static String reverse(String str, int choice) {
        if (choice < 1 || choice > 2) {
            return "Incorrect choice!";
        }
        String substr = "";
        if (choice == 1) {
            substr = str.substring(0, str.indexOf(" "));
        }
        if (choice == 2) {
            substr = str.substring(str.lastIndexOf(" ") + 1);
        }
        return reverse(str, substr);
    }
}
