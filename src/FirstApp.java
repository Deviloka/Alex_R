public class FirstApp {
    static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    static void checkSumSign(){
        int a = 1;
        int b = 2;
        int total = a + b;
        if (total >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }

    }

    static void printColor(){
        int value = 1;

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
    static void compareNumbers(){
        int a = 10;
        int b = 2;
        String peremen;
        peremen = (a >= b) ? "a >= b" : "a < b";
        System.out.println (peremen);
    }
    static void checkBoolean() {
        int a = 10;
        int b = 10;
        int total = a + b;
        if (total >= 10 && total <= 20) {
            System.out.println (true);
        }
        else {
            System.out.println (false);
        }
    }



    public static void main (String[] args){
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        checkBoolean();

    }
}

