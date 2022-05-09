import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
//        isYearVis(1900);
//        installApp(1,2022);
        int deliveryDistance = 95;
        countDays(deliveryDistance);
    }

    private static void countDays(int deliveryDistance) {
        int countDay = 0;
        if (deliveryDistance <= 20) {
            countDay = 1;
        } else if (deliveryDistance <= 60) {
            countDay = 2;
        } else if (deliveryDistance <= 100) {
            countDay = 3;
        }
        System.out.println("Потребуется дней: " + countDay);
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