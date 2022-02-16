package ua.com.alevel;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RunProgram {
    public static void run() {
        System.out.println("Program is running...");
        navigation();
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while (true) {
                System.out.print("Enter your choice -> ");
                line  = reader.readLine();
                switch (line) {
                    case "1" -> {
                        System.out.print("Enter the string -> ");
                        System.out.println(ReverseStringUtil.reverse(reader.readLine()));
                    }
                    case "2" -> {
                        System.out.print("Enter the string -> ");
                        System.out.println(ReverseStringUtil.reverseEachWord(reader.readLine()));
                    }
                    case "3" -> {
                        System.out.print("Enter the string and the substring (use the comma to split)-> ");
                        String[] splitString = reader.readLine().split(",");
                        System.out.println(ReverseStringUtil.reverse(splitString[0], splitString[1]));
                    }
                    case "4" -> {
                        System.out.print("Enter the string and the indexes from ... to ... (use the comma to split)-> ");
                        String[] splitString = reader.readLine().split(",");
                        System.out.println(ReverseStringUtil.reverse(splitString[0],
                                Integer.parseInt(splitString[1]),
                                Integer.parseInt(splitString[2])));
                    }
                    case "5" -> {
                        System.out.print("Enter 1 or 2 -> ");
                        String ch = reader.readLine();
                        switch (ch) {
                            case "1" -> {
                                System.out.print("Enter the string -> ");
                                System.out.println(ReverseStringUtil.reverse(reader.readLine(), 1));
                            }
                            case "2" -> {
                                System.out.print("Enter the string -> ");
                                System.out.println(ReverseStringUtil.reverse(reader.readLine(), 2));
                            }
                        }
                    }
                    case "0" -> System.exit(0);
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void navigation() {
        System.out.println("**************** Reverse strings *******************");
        System.out.println("(1) Reverse the whole string");
        System.out.println("(2) Reverse each word in the string");
        System.out.println("(3) Reverse the substring in the string");
        System.out.println("(4) Reverse the string in the range");
        System.out.println("(5) Reverse first or last word in the string");
        System.out.println("        1 -> first word");
        System.out.println("        2 -> last word");
        System.out.println("(0) Exit");
    }
}
