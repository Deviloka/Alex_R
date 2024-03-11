package Perimeter;

public class Main {
    public static void main(String[] args) {
        Фигура круг = new Круг(5, "красный", "черный");
        Фигура прямоугольник = new Прямоугольник(4, 5, "синий", "белый");
        Фигура треугольник = new Треугольник(3, 4, 5, "зеленый", "оранжевый");
        System.out.println(круг);
        System.out.println(прямоугольник);
        System.out.println(треугольник);
    }
}