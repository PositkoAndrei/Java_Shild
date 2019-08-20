package Assingment;

public class AssingmentOpp {
    public static void main(String[] args) {
        double x, y;
        byte b;
        int i;
        char ch;

        x = 10.0;
        y = 3.0;
        i = (int) (x / y);//ПРивести тип double в тип int;
        System.out.println("Result x / y: " + i);

        i = 100;
        b = (byte) i;
        System.out.println("B is: " + b);

        i = 257;
        b = (byte) i; //we lost information;
        System.out.println("Result of B: " + b);

        b = 88;
        ch = (char) b;
        System.out.println("ch: " + ch);
    }
}