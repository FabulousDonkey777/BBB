package Lesson_4;

public class Sotrudnik {
    private String fio;
    private String dolzhnost;
    private String email;
    private String telefon;
    private double zarplata;
    private int vozrast;

    public Sotrudnik(String fio, String dolzhnost, String email, String telefon, double zarplata, int vozrast) {
        this.fio = fio;
        this.dolzhnost = dolzhnost;
        this.email = email;
        this.telefon = telefon;
        this.zarplata = zarplata;
        this.vozrast = vozrast;
    }


    public void printInfo() {
        System.out.println("ФИО: " + fio);
        System.out.println("Должность: " + dolzhnost);
        System.out.println("Email: " + email);
        System.out.println("Телефон: " + telefon);
        System.out.println("Зарплата: " + zarplata);
        System.out.println("Возраст: " + vozrast);
    }


}