package ua.com.alevel.university;

import java.util.Random;
import rx.observables.*;

public class Student {
    public static void student() {
        Random random = new Random();
        int age = random.nextInt(100);
        System.out.println("I'm a student\nMy age is " + age);

        System.out.println("Student.student");
        System.out.println(StringObservable.class);
    }
}