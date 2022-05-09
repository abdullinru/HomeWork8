import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
//        isYearVis(1900);
        installApp(1,2022);
    }
    private static void isYearVis(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " - весокосный год");
        } else {
            System.out.println(year + " - невесокосный год");
        }
    }
    private static void installApp(int os, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (os == 0) {
            if (clientDeviceYear < currentYear) {
                System.out.println("Установите лайт версию приложения для IOS");
            } else {
                System.out.println("Установите версию приложения для IOS");
            }
        }
        if (os == 1) {
            if (clientDeviceYear < currentYear) {
                System.out.println("Установите лайт версию приложения для Андроид");
            } else {
                System.out.println("Установите версию приложения для Андроид");
            }
        }

    }
}