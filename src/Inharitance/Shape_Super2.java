package Inharitance;

class TwoDShape_5 {
    private double width;
    private double heigth;

    //Конструктор по умолчанию

    TwoDShape_5(){
        width = heigth = 0.0;
    }
    //Параметизированный конструктор

    TwoDShape_5(double w, double h){
        width = w;
        heigth = h;
    }

    //Конструирование обьекта с одинаковыми значениями
    //переменных экземпляра width and hight

    TwoDShape_5(double x){
        width = heigth = x;
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

class Triangle_5 extends TwoDShape_5 {
    String style;

    //Конструктор по умолчанию
    Triangle_5(){
        super();//вызвать конструктор по умолчанию
        style = "none";
    }
    //Конструктор
    Triangle_5(String s, double w, double h){
        super(w, h);
        style = s;
    }
    //Конструктор с одним аргументом
    Triangle_5(double x){
        super(x);
        style = "закрашенный";
    }

    double area() {
        return getWidth() * getHeigth() / 2;
    }

    void showStyle() {
        System.out.println("Треугольник: " + style);
    }
}


public class Shape_Super2 {
    public static void main(String[] args) {
        Triangle_5 t1 = new Triangle_5();
        Triangle_5 t2 = new Triangle_5("контурный", 8.0, 12.0);
        Triangle_5 t3 = new Triangle_5(5);

        t1 = t2;

        System.out.println("Информация о t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Площадь - " + t1.area());

        System.out.println();

        System.out.println("Информация о t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Площадь - " + t2.area());

        System.out.println();

        System.out.println("Информация о t3: ");
        t3.showStyle();
        t3.showDim();
        System.out.println("Площадь - " + t3.area());

    }

}





