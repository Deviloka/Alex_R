package Perimeter;

class Круг implements Фигура {
    private double радиус;
    private String цветЗаливки;
    private String цветГраницы;

    public Круг(double радиус, String цветЗаливки, String цветГраницы) {
        this.радиус = радиус;
        this.цветЗаливки = цветЗаливки;
        this.цветГраницы = цветГраницы;
    }

    public double расчетПериметра() {
        return 2 * Math.PI * радиус;
    }

    public double расчетПлощади() {
        return Math.PI * радиус * радиус;
    }

    public String toString() {
        return "Круг: " + "Периметр = " + расчетПериметра() + ", " +
                "Площадь = " + расчетПлощади() + ", " +
                "Цвет заливки = " + цветЗаливки + ", " +
                "Цвет границы = " + цветГраницы;
    }
}
