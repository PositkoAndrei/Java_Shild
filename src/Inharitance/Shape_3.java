package Inharitance;

    class TwoDShape_3 {
        private double width;
        private double heigth;

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

    class Triangle_3 extends TwoDShape_3 {
        String style;

        Triangle_3(String s, double w, double h) {
            setWidth(w);
            setHeigth(h);
            style = s;
        }

        double area() {
            return getWidth() * getHeigth() / 2;
        }

        void showStyle() {
            System.out.println("Треугольник: " + style);
        }
    }


    public class Shape_3 {
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


