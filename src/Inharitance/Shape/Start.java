package Inharitance.Shape;

public class Start {
    public static void main(String[] args) {
        TwoDShape[] shapes = new TwoDShape[5];
        //TwoDShape ob = new TwoDShape("")

        shapes[0] = new Triangle("контурный", 8.0, 12.0);
        shapes[1] = new Rectangle(10);
        shapes[2] = new Rectangle(10, 4);
        shapes[3] = new Triangle(7.0);
        shapes[4] = new TwoDShape(10, 20, "Фигура");

        for (int i = 0; i < shapes.length; i++){
            System.out.println("Обьект - " + shapes[i].getName());
            System.out.println("Площадь - " + shapes[i].area());
            System.out.println();

        }
    }
}
