package ua.com.alevel;

import ua.com.alevel.university.Student;
import ua.com.alevel.university.Teacher;

public class App {
    public static void main(String[] args) {
        System.out.println("Maven project");
        System.out.println("This is a university!");

        Student student = new Student();
        student.student();

        Teacher teacher = new Teacher();
        teacher.teacher();
    }
}