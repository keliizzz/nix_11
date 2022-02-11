package ua.com.alevel;

public class EndLessons {
    public static void findEndOfLesson(int lessonNumber) {
        int num = lessonNumber * 45 + lessonNumber / 2 * 5 + (lessonNumber - 1) / 2 * 15;
        int hours = 9 + num / 60;
        int minutes = num % 60;
        System.out.println(hours + ":" + minutes);
    }
}
