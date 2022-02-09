package ua.com.alevel.university;

import org.apache.commons.collections.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Student {
    public static void student() {
        Random random = new Random();
        int age = random.nextInt(100);
        System.out.println("I'm a student\nMy age is " + age);

        List<String> list1 = new ArrayList<>();
        list1.add("Anna");
        list1.add("Peter");
        System.out.println("List of students is not empty?");
        System.out.println(CollectionUtils.isNotEmpty(list1));
    }
}