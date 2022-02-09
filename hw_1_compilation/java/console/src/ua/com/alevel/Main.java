package ua.com.alevel;

import ua.com.alevel.university.Student;
import ua.com.alevel.university.Teacher;

public class Main {
    public static void main(String[] args) {
        System.out.println("Console project");
        System.out.println("This is a university!");

        Student student = new Student();
        student.student();

        Teacher teacher = new Teacher();
        teacher.teacher();
    }
}