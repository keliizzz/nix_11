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
                        System.out.println(ParseString.findNumbers(reader.readLine()));
                    }
                    case "2" -> {
                        System.out.print("Enter the string -> ");
                        ParseString.findAmountOfCharacters(reader.readLine());
                    }
                    case "3" -> {
                        System.out.print("Enter the number of the lesson(1-10) -> ");
                        EndLessons.findEndOfLesson(Integer.parseInt(reader.readLine()));
                    }
                    case "0" -> {
                        System.exit(0);
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void navigation() {
        System.out.println("**************** Solving problems *******************");
        System.out.println("(1) Parse string, find numbers and count a sum");
        System.out.println("(2) Parse string, find symbols and show their amount");
        System.out.println("(3) The end of classes");
        System.out.println("(0) Exit");
    }
}
