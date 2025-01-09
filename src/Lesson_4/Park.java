package Lesson_4;

import java.util.ArrayList;

public class Park {
    private ArrayList<Attraction> attractions;

    public Park() {
        attractions = new ArrayList<>();
        // Добавляем некоторые аттракционы по умолчанию
        attractions.add(new Attraction("Каруселька", "18-19", 5));
        attractions.add(new Attraction("Колесо обозрения", "19-20", 10));
        attractions.add(new Attraction("Коняшки", "19-21", 15));
        attractions.add(new Attraction("Горка американская", "21-24", 500));
    }

    public void addAttraction(String name, String schedule, int cost) {
        attractions.add(new Attraction(name, schedule, cost));
    }

    class Attraction {
        private String name;
        private String schedule;
        private int cost;

        public Attraction(String name, String schedule, int cost) {
            this.name = name;
            this.schedule = schedule;
            this.cost = cost;
        }

        public String getInfo() {
            return "Информация по аттракционам парка: " + name + " " + schedule + " " + cost;
        }
    }

    public void printInfo() {
        for (Attraction attraction : attractions) {
            System.out.println(attraction.getInfo());
        }
    }

    public static void printall() {
        Park park = new Park();
        park.printInfo();

        // Добавляем новый аттракцион
        park.addAttraction("Водная горка", "10-22", 300);
        System.out.println("После добавления нового аттракциона:");
        park.printInfo();
    }
}