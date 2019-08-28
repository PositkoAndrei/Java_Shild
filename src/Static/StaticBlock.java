package Static;

class SBlock {
    static double rootOf2;
    static double rootOf3;

    static {
        System.out.println("Внутри статического блока");
        rootOf2 = Math.sqrt(2.0);
        rootOf3 = Math.sqrt(3.0);
    }
    SBlock(String msg){
        System.out.println(msg);
    }
}

public class StaticBlock {
    public static void main(String[] args) {
        SBlock ob = new SBlock("Внутри конструктора");

        System.out.println("Корень квадратный из 2 равен: " +
                SBlock.rootOf2);
        System.out.println("Корень квадратный из 3 равен: " +
                SBlock.rootOf3);


    }
}
