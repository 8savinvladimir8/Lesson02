package university.innopolis.Lesson02;

public class Main {

    public static void main(String[] args) {

        /* Считаем стоимость бензина */

        int litersCount = 50;
        double literPrice = 43.00;
        System.out.println("Стоимость бензина: " + litersCount * literPrice + " руб.");

        /* Считаем зарплату "на руки" */

        double salary = 70000.00;
        System.out.println("Зарплата \"на руки\": " + salary * 0.87 + " руб.");

        /* Конвертируем секунды в часы */

        int secondsCount = 3600;
        System.out.println("Количество часов: " + secondsCount / 3600 + " час");
    }
}
