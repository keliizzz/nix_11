package ua.com.alevel;


public class ParseString {
    public static int findNumbers(String str) {
        char[] splitString = str.toCharArray();
        int sum = 0;
        for (int i = 0; i < splitString.length; i++) {
            if (splitString[i] > 47 && splitString[i] < 58) {
                sum += Integer.parseInt(String.valueOf(splitString[i]));
            }
        }
        return sum;
    }

    public static void findAmountOfCharacters(String str) {
        String uniqueCharacters = "";
        for (int i = 0; i < str.length(); i++) {
            if (uniqueCharacters.indexOf(str.charAt(i)) == -1 && (str.charAt(i) < 47 || str.charAt(i) > 58)) {
                uniqueCharacters = uniqueCharacters + str.charAt(i);
            }
        }
        char[] charStr = uniqueCharacters.toCharArray();
        int[] amount = new int[uniqueCharacters.length()];
        char temp;
        for (int i = 0; i < uniqueCharacters.length(); i++) {
            temp = uniqueCharacters.charAt(i);
            for (int j = 0; j < str.length(); j++) {
                if (temp == str.charAt(j)) {
                    amount[i]++;
                }
            }
        }
        for (int i = 0; i < amount.length; i++) {
            for (int j = i + 1; j < amount.length; j++) {
                int tmpNum;
                char tmpChar;
                if (amount[i] < amount[j]) {
                    tmpNum = amount[i];
                    amount[i] = amount[j];
                    amount[j] = tmpNum;
                    tmpChar = charStr[i];
                    charStr[i] = charStr[j];
                    charStr[j] = tmpChar;
                }
            }
        }
        for (int i = 0; i < amount.length; i++) {
            System.out.println(charStr[i] + " - " + amount[i]);
        }
    }
}
