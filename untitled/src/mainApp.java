public class mainApp {

    public static void main(String[] args) {

        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");

        checkSumSign();
        printColor();
        compareNumbers();
    }
    public static void checkSumSign() {
        int a = 25;
        int b = 30;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println(" Сумма положительная ");
        } else {
            System.out.println(" Сумма отрицательная ");
        }
    }
    public static void printColor() {
        int value = 100;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 & value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 10;
        int b = 50;

        if (a >= b) {
            System.out.println("а >= b");
        } else {
            System.out.println("а < b");
        }

    }
}
