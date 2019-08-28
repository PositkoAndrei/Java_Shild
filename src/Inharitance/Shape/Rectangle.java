package Inharitance.Shape;

public class Rectangle extends TwoDShape {
    //Конструктор по умолчанию
    Rectangle(){
        super();
    }
    //Конструктор класса Rectangle
    Rectangle(double w, double h){
        super(w, h, "Пямоугольник");
    }
    //Создать квадрат
    Rectangle(double x){
        super(x, "Прямоугольник");
    }
    //Создать один обьект на основании другого
    Rectangle(Rectangle ob){
        super(ob);
    }
    boolean isSquare(){
        if (getWidth() == getHeigth()){
            return true;
        }else{
            return false;
        }
    }
    //Переопределение метода area()
    double area(){
        return getWidth() * getHeigth();
    }

}
