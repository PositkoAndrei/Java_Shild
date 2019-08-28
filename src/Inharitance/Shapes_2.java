package Inharitance;

class TwoDShape_2 {
    private double width;
    private double heigth;

    double getWidth(){
        return width;
    }
    double getHeigth(){
        return heigth;
    }
    void setWidth(double w){
        width = w;
    }
    void setHeight(double h){
        heigth = h;
    }

    void showDim() {
        System.out.println("Ширина и высота: " +
                width + " and " + heigth);

    }
}

class Triangle_2 extends TwoDShape_2 {
    String style;

    double area() {
        return getWidth() * getHeigth() / 2;
    }

    void showStyle() {
        System.out.println("Треугольник: " + style);
    }
}

public class Shapes_2 {
    public static void main(String[] args) {
        Triangle_2 t1 = new Triangle_2();
        Triangle_2 t2 = new Triangle_2();

        t1.setWidth(4.0);
        t1.setHeight(3.0);
        t1.style = "закрашеный";

        t2.setWidth(8.0);
        t2.setHeight(12.0);
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


