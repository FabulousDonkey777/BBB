package Lesson_3;

public class Task3 {


    public static void printColor() {
        int value = 150;
        if (value < 0) {
            System.out.println("�������");
        } else if (value >= 0 && value <= 100) {
            System.out.println("������");
        } else {
            System.out.println("�������");
        }
    }
}