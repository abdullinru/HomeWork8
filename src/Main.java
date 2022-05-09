public class Main {
    public static void main(String[] args) {
        isYearVis(1900);
    }
    private static void isYearVis(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " - весокосный год");
        } else {
            System.out.println(year + " - невесокосный год");
        }
    }
}