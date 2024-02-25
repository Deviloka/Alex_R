import java.util.Arrays;
import java.util.regex.Matcher;
//1. Создайте метод printThreeWords(), который при вызове должен отпечатать в столбец три слова: Orange, Banana, Apple.
public class FirstApp {
    static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
//    2. Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b, и инициализируйте их любыми
//    значениями, которыми захотите. Далее метод должен просуммировать эти переменные, и если их сумма больше или равна 0,
//    то вывести в консоль сообщение “Сумма положительная”, в противном случае - “Сумма отрицательная”;
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
//    3. Создайте метод printColor() в теле которого задайте int переменную value и инициализируйте ее любым значением.
//    Если value меньше 0 (0 включительно), то в консоль метод должен вывести сообщение “Красный”, если лежит в пределах
//    от 0 (0 исключительно) до 100 (100 включительно), то “Желтый”, если больше 100 (100 исключительно) - “Зеленый”;

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
//    4. Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b, и инициализируйте их любыми
//    значениями, которыми захотите. Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”,
//    в противном случае “a < b”;
    static void compareNumbers(){
        int a = 10;
        int b = 2;
        String peremen;
        peremen = (a >= b) ? "a >= b" : "a < b";
        System.out.println (peremen);
    }
//    5. Напишите метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20
//            (включительно), если да – вернуть true, в противном случае – false.
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
//    6. Напишите метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
//    положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.

    static void comparator(int a) {
        int myNumber =  Integer.signum(a);
        if (myNumber >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }

    }
//    7. Напишите метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное,
//    и вернуть false если положительное.

    static void checkTrueFalse(int a) {
        if (a < 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
//    8. Напишите метод, которому в качестве аргументов передается строка и число, метод должен отпечатать
//    в консоль указанную строку, указанное количество раз;
    static void loopPrinter(String message,Integer count){
        for (int i = 1; i<= count;i += 1){
            System.out.println("#" + i + " " + message);
        }
    }
//    9. Напишите метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true,
//     не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    static void Years(int year){
        Boolean everyFour = year %4 == 0;
        Boolean everyHundred = year %100 == 0;
        Boolean everyFourHundred = year %400 == 0;

        Boolean answer = !everyFour || (everyHundred && !everyFourHundred);
        String message = answer ? " не високосный": " високосный";

        System.out.println(year + message );
    }
//    10. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
//    С помощью цикла и условия заменить 0 на 1, 1 на 0;
    static void massive(){
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        System.out.println("oldArray " + Arrays.toString(arr));

        for (int num = 0;num < arr.length; num += 1){
            int invert = arr[num] == 0 ? 1 : 0;
            arr[num] = invert;
        }
        System.out.println("newArray " + Arrays.toString(arr));
        
    }

    public static void main (String[] args){
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        checkBoolean();
        comparator(10);
        checkTrueFalse(10);
        loopPrinter("Hello world",4);
        Years(1948);
        massive();

    }
}

