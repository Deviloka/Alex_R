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


    public static void main (String[] args){
        printThreeWords();
        checkSumSign();
    }
}

