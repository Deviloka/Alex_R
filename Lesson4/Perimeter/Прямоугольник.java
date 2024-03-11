package Perimeter;

class Прямоугольник implements Фигура {
    private double ширина;
    private double высота;
    private String цветЗаливки;
    private String цветГраницы;

    public Прямоугольник(double ширина, double высота, String цветЗаливки, String цветГраницы) {
        this.ширина = ширина;
        this.высота = высота;
        this.цветЗаливки = цветЗаливки;
        this.цветГраницы = цветГраницы;
    }

    public double расчетПериметра() {
        return 2 * (ширина + высота);
    }

    public double расчетПлощади() {
        return ширина * высота;
    }

    public String toString() {
        return "Прямоугольник: " + "Периметр = " + расчетПериметра() + ", " +
                "Площадь = " + расчетПлощади() + ", " +
                "Цвет заливки = " + цветЗаливки + ", " +
                "Цвет границы = " + цветГраницы;
    }
}
