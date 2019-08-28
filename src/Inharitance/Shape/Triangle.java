package Inharitance.Shape;

public class Triangle extends TwoDShape {
    private String style;

    Triangle(){
        super();
        style = "none";
    }
    Triangle(String s, double w, double h){
        super(w, h, "Треугольник");
        style = s;
   }
   Triangle(double x){
        super(x, "Треугольник");
        style = "Закрашенный";
   }
   Triangle(Triangle ob){
        super(ob);
        style = ob.style;
   }
   //Переопределение метода area()
    double area(){
        return getWidth() * getHeigth() / 2;
    }
    void showStyle(){
        System.out.println("Треугольник " + style);
    }

}
