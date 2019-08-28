package Inharitance;

class TwoDShape {
    double width;
    double heigth;

    void showDim() {
        System.out.println("Ширина и высота: " +
                width + " and " + heigth);

    }
}

class Triangle extends TwoDShape {
    String style;

    double area() {
        return width * heigth / 2;
    }

    void showStyle() {
        System.out.println("Треугольник: " + style);
    }
}

public class Shapes {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle();

        TwoDShape ob1 = new Triangle();

        t1.width = 4.0;
        t1.heigth = 3.0;
        t1.style = "закрашеный";

        t2.width = 8.0;
        t2.heigth = 12.0;
        t2.style = "контурный";

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
