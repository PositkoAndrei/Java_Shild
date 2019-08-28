package Inharitance;

class TwoDShape_4 {
    private double width;
    private double heigth;

    TwoDShape_4(double w, double h) {
        width = w;
        heigth = h;
    }

    double getWidth() {
        return width;
    }

    double getHeigth() {
        return heigth;
    }

    void setWidth(double w) {
        width = w;
    }

    void setHeigth(double h) {
        heigth = h;
    }

    void showDim() {
        System.out.println("Ширина и высота: " +
                width + " and " + heigth);

    }
}

class Triangle_4 extends TwoDShape_4 {
    String style;

    Triangle_4(String s, double w, double h) {
        super(w, h);
        style = s;
    }

    double area() {
        return getWidth() * getHeigth() / 2;
    }

    void showStyle() {
        System.out.println("Треугольник: " + style);
    }
}


public class Shape_Super {
    public static void main(String[] args) {
        Triangle_3 t1 = new Triangle_3("закрашенный", 4.0, 3.0);
        Triangle_3 t2 = new Triangle_3("контурный", 8.0, 12.0);


        System.out.println("Информация о t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Площадь - " + t1.area());

        System.out.println();

        System.out.println("Информация о t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Площадь - " + t2.area());

    }

}




