package Inharitance.Shape;

public class TwoDShape {
    private double width;
    private double heigth;
    private String name;

    TwoDShape(){
        width = heigth = 0;
        name = "none";
    }
    TwoDShape(double w, double h, String n){
        width = w;
        heigth = h;
        name = n;
    }
    TwoDShape(double x, String n){
        width = heigth = x;
        name = n;
    }
    //Один обьект на основании другого
    TwoDShape(TwoDShape ob){
        width = ob.width;
        heigth = ob.heigth;
        name = ob.name;
    }
    double getWidth(){
        return width;
    }
    double getHeigth(){
        return heigth;
    }
    void setWidth(double w){
        width = w;
    }
    void setHeigth(double h){
        heigth = h;
    }
    String getName(){
        return name;
    }
    void showDim(){
        System.out.println("Ширина и высота - " + width + " and " +
                heigth);
    }
    double area(){
        System.out.println("Метод area() должен быть переопределен!");
        return 0.0;
    }
}
